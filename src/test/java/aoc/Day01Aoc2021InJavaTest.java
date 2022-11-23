package aoc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day01Aoc2021InJavaTest {

    private final Day01Aoc2021InJava day01Aoc2021InJava = new Day01Aoc2021InJava();

    @Test
    @DisplayName("answer part 1 test input equals expected by aoc")
    void test1() {
        final var result = day01Aoc2021InJava.part1("input/day1test.txt");
        assertEquals(7, result);
    }

    @Test
    @DisplayName("answer part 1 equals expected by aoc")
    void test2() {
        final var result = day01Aoc2021InJava.part1();
        assertEquals(1_722, result);
    }

    @Test
    @DisplayName("answer part 2 equals expected by aoc")
    void test3() {
        final var result = day01Aoc2021InJava.part2("input/day1test.txt");
        assertEquals(5, result);
    }

}
