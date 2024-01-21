package main.java.strivers.step1.step6.hashing;

import java.util.HashMap;
import java.util.Map;

public class P2FrequencyOfElementInArray {
    public static void main(String[] args){
        Map<Integer, Integer> arr = countFrequency(new int[]{10,5,10,15,10,5});
    }

    private static Map<Integer, Integer> countFrequency(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            map.computeIfPresent(i, (k, v) -> v+1);
            map.putIfAbsent(i, 1);
        }


        return map;
    }
}
