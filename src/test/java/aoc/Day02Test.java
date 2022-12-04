package aoc;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import testutils.Day;
import testutils.TestFilePathParameterResolver;

import static org.junit.jupiter.api.Assertions.*;

@Day("02")
@ExtendWith(TestFilePathParameterResolver.class)
class Day02Test {

    private final Day02 day02 = new Day02();

    @Test
    void part1(String sample, String test) {
        final var testResult = day02.part1(sample);
        System.out.println("testResult = " + testResult);
        assertEquals(15, testResult);

        final var result = day02.part1(test);
        System.out.println("result = " + result);
        assertEquals(14_163, result);
    }

    @Test
    void part2(String sample, String test) {
        final var testResult = day02.part2(sample);
        System.out.println("testResult = " + testResult);
        assertEquals(12, testResult);

        final var result = day02.part2(test);
        System.out.println("result = " + result);
        assertEquals(12_091, result);
    }

}