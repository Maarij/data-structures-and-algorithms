package main.java.hackerrank.threemonth.week2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P1UniqueElementInArray {
    public static void main(String[] args) {
        System.out.println(fineUniqueElement(Arrays.asList(34, 95, 34, 64, 45, 95, 16, 80, 80, 75, 3, 25, 75, 25, 31, 3, 64, 16, 31)));
    }

    private static int fineUniqueElement(List<Integer> a) {
        if (a.size() == 1) return a.get(0);

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : a) {
            map.computeIfPresent(i, (k, v) -> v + 1);
            map.putIfAbsent(i, 1);
        }

        int key = 0;
        int frequency = Integer.MAX_VALUE;
        for (Integer i : map.keySet()) {
            if (map.get(i) < frequency) {
                key = i;
                frequency = map.get(i);
            }
        }

        return key;
    }
}
