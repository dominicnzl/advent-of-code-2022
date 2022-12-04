package aoc;

import utils.FileUtils;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Day01 {

    public Integer part1(String inputPath) {
        return getMap(inputPath).values().stream().max(Integer::compareTo).orElseThrow();
    }

    public Integer part2(String inputPath) {
        return getMap(inputPath).values()
                .stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .reduce(0, Integer::sum);
    }

    public Map<Integer, Integer> getMap(String inputFilePath) {
        var lines = FileUtils.getLines(inputFilePath).toList();
        Map<Integer, Integer> map = new HashMap<>();
        BiFunction<Integer, Integer, Integer> sum = Integer::sum;
        for (int i = 0, key = 0; i < lines.size(); i++) {
            var value = lines.get(i);
            if (value.isEmpty()) {
                key++;
                continue;
            }
            var intValue = Integer.valueOf(value);
            map.merge(key, intValue, (k, v) -> sum.apply(k, intValue));
        }
        return map;
    }
}
