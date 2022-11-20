package aoc

import org.junit.jupiter.api.Test
import utils.assertEqualTo

internal class Day01Test {

    @Test
    fun testSumDepthIncreases() = Day01.part1().also(::println).assertEqualTo(1_722)

    @Test
    fun testSumDepthRangeIncreases() = Day01.part2().also(::println).assertEqualTo(1_748)

    @Test
    fun `part 2 v2 gives same answer`() {
        val filePath = "input/day1.txt"
        Day01.part2(filePath).assertEqualTo(Day01.part2V2(filePath))
    }
}
