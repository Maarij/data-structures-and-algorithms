package main.java.hackerrank.threemonth.week1;

import java.util.Arrays;
import java.util.List;

public class P4BreakingRecords {
    public static void main(String[] args) {
        breakingRecords(Arrays.asList(12, 24, 10, 24)).forEach(System.out::println);
    }

    private static List<Integer> breakingRecords(List<Integer> scores) {
        if (scores.isEmpty()) {
            return Arrays.asList(0, 0);
        }

        int maxRecord = scores.get(0);
        int maxCount = 0;
        int minRecord = scores.get(0);
        int minCount = 0;

        for (Integer s : scores) {
            if (maxRecord < s) {
                maxRecord = s;
                maxCount++;
            }
            if (minRecord > s) {
                minRecord = s;
                minCount++;
            }
        }

        return Arrays.asList(maxCount, minCount);
    }
}
