package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Function;
import java.util.stream.Stream;

public final class FileUtils {

    private FileUtils() {
    }

    public static <R> R useLines(String filePath, Function<Stream<String>, ? extends R> resultMapper) {
        try (final var lines = Files.lines(Path.of(filePath))) {
            return resultMapper.apply(lines);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public static Stream<String> getLines(String filePath) {
        try {
            return Files.lines(Path.of(filePath));
        } catch (IOException e) {
            System.out.println("could not read between the lines");
        }
        throw new IllegalArgumentException("could not read between the lines");
    }
}
