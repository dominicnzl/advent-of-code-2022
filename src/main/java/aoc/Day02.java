package aoc;

import utils.FileUtils;

import java.util.Map;

public class Day02 {

    final Map<String, Integer> resultPart1 = Map.of(
            "A X", 3 + 1,
            "A Y", 6 + 2,
            "A Z", 0 + 3,
            "B X", 0 + 1,
            "B Y", 3 + 2,
            "B Z", 6 + 3,
            "C X", 6 + 1,
            "C Y", 0 + 2,
            "C Z", 3 + 3);
    static final Map<String, Integer> loseDrawWin = Map.of("X", 0, "Y", 3, "Z", 6);

    static final Map<String, Integer> resultPart2 = Map.of(
            "A X", 3, // s -> 3
            "A Y", 1, // r -> 1
            "A Z", 2, // p -> 2
            "B X", 1, // s -> 1
            "B Y", 2, // p -> 2
            "B Z", 3, // r -> 3
            "C X", 2, // p -> 2
            "C Y", 3, // s -> 3
            "C Z", 1 // r -> 1
    );

    public Integer part1(String inputPath) {
        return FileUtils.getLines(inputPath)
                .map(resultPart1::get)
                .reduce(0, Integer::sum);
    }

    public Integer part2(String inputPath) {
        return FileUtils.getLines(inputPath)
                .map(Day02::determineScore)
                .reduce(0, Integer::sum);
    }

    private static Integer determineScore(String combination) {
        return loseDrawWin.get(String.valueOf(combination.charAt(2))) + resultPart2.get(combination);
    }
}
