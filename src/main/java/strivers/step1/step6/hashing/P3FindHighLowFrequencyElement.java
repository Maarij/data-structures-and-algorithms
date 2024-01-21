package main.java.strivers.step1.step6.hashing;

import java.util.HashMap;
import java.util.Map;

public class P3FindHighLowFrequencyElement {
    public static void main(String[] args) {
        findHighLowFrequency(new int[]{10, 5, 10, 15, 10, 5});
    }

    private static void findHighLowFrequency(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            map.computeIfPresent(i, (k, v) -> v + 1);
            map.putIfAbsent(i, 1);
        }

        int high = 0, highFrequency = 0, low = 0, lowFrequency = 0;
        for (Integer k : map.keySet()) {
            if (highFrequency == 0 || highFrequency < map.get(k)) {
                high = k;
                highFrequency = map.get(k);
            }
            if (lowFrequency == 0 || lowFrequency > map.get(k)) {
                low = k;
                lowFrequency = map.get(k);
            }
        }

        System.out.println(high + " " + low);
    }
}
