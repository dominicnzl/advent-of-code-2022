package aoc

import org.junit.jupiter.api.Test
import utils.assertEqualTo

internal class Day01Aoc2021Test {

    @Test
    fun `answer part 1 equals expected by aoc`() = Day01Aoc2021.part1().also(::println).assertEqualTo(1_722)

    @Test
    fun `answer part 2 equals expected by aoc`() = Day01Aoc2021.part2().also(::println).assertEqualTo(1_748)

    @Test
    fun `part 2 v2 gives same answer`() {
        val filePath = "input/day1.txt"
        Day01Aoc2021.part2(filePath).assertEqualTo(Day01Aoc2021.part2V2(filePath))
    }
}
