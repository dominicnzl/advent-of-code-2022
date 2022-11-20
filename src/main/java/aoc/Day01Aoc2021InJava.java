package aoc;

import org.jetbrains.annotations.NotNull;
import utils.FileUtils;

/**
 * @see <a href="https://adventofcode.com/2021/day/1">Day 1: Sonar Sweep</a>
 */
public class Day01Aoc2021InJava implements ChallengeDay {

    public int part1(String fileName) {
        final var integers = FileUtils.useLines(fileName, s -> s.mapToInt(Integer::parseInt).toArray());
        int result = 0;
        for (int i = 0; i < integers.length - 1; i++) {
            final var cur = integers[i];
            final var next = integers[i + 1];
            if (cur < next) {
                result++;
            }
        }
        return result;
    }

    public int part2(String fileName) {
        final var integers = FileUtils.useLines(fileName, s -> s.mapToInt(Integer::parseInt).toArray());
        int result = 0;
        for (int i = 0; i < integers.length - 3; i++) {
            final var second = integers[i + 1];
            final var third = integers[i + 2];
            final var cur = integers[i] + second + third;
            final var next = second + third + integers[i + 3];
            if (cur < next) {
                result++;
            }
        }
        return result;
    }

    @NotNull
    @Override
    public Integer part1() {
        return part1(ChallengeDay.Companion.getInputDir() + "/day1.txt");
    }

    @NotNull
    @Override
    public Integer part2() {
        return part2(ChallengeDay.Companion.getInputDir() + "/day1.txt");
    }
}
