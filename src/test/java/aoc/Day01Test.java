package aoc;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import testutils.Day;
import testutils.TestFilePathParameterResolver;

import static org.junit.jupiter.api.Assertions.*;

@Day("01")
@ExtendWith(TestFilePathParameterResolver.class)
class Day01Test {

    private final Day01 day01 = new Day01();

    @Test
    void part1(String sample, String test) {
        final var testResult = day01.part1(sample);
        System.out.println("testResult = " + testResult);
        assertEquals(24_000, testResult);

        final var result = day01.part1(test);
        System.out.println("result = " + result);
        assertEquals(71_124, result);
    }

    @Test
    void part2(String sample, String test) {
        final var testResult = day01.part2(sample);
        System.out.println("testResult = " + testResult);
        assertEquals(45_000, testResult);

        final var result = day01.part2(test);
        System.out.println("result = " + result);
        assertEquals(204_639, result);
    }
}
