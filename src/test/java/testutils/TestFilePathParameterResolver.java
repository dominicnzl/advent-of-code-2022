package testutils;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

import java.lang.reflect.Executable;
import java.util.Optional;

public class TestFilePathParameterResolver implements ParameterResolver {
    @Override
    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return parameterContext.getParameter().getType() == String.class;
    }

    @Override
    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        // don't do this at home kids
        return path(parameterContext, "arg0".equals(parameterContext.getParameter().getName()));
    }

    private static String path(ParameterContext parameterContext, boolean isSample) {
        final String pathTemplate = isSample ? "input/day-%s-sample.txt" : "input/day-%s.txt";
        return Optional.of(parameterContext.getDeclaringExecutable())
                .map(Executable::getDeclaringClass)
                .map(method -> method.getAnnotation(Day.class))
                .map(Day::value)
                .map(day -> String.format(pathTemplate, day))
                .orElse("");
    }
}
