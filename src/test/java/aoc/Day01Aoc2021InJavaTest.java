package aoc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day01Aoc2021InJavaTest {

    private final Day01Aoc2021InJava day01Aoc2021InJava = new Day01Aoc2021InJava();

    @Test
    void testPart1TestInput() {
        final var result = day01Aoc2021InJava.part1("input/day1test.txt");
        assertEquals(7, result);
    }

    @Test
    void testPart1() {
        final var result = day01Aoc2021InJava.part1();
        assertEquals(1_722, result);
    }

    @Test
    void testInputPart2() {
        final var result = day01Aoc2021InJava.part2("input/day1test.txt");
        assertEquals(5, result);
    }

}
