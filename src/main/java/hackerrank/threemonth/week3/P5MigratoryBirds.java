package main.java.hackerrank.threemonth.week3;

import java.util.Arrays;
import java.util.List;

public class P5MigratoryBirds {
    public static void main(String[] args){
        System.out.println(migratoryBirds(Arrays.asList(1,1,2,2,3)));
    }

    private static int migratoryBirds(List<Integer> arr) {
        int[] count = new int[6];

        for (int i : arr) {
            count[i]++;
        }

        int mostSeenIndex = Integer.MAX_VALUE;
        int mostSeenCount = Integer.MIN_VALUE;

        for (int i = 0; i < count.length ; i++) {
            if (count[i] > mostSeenCount) {
                mostSeenIndex = i;
                mostSeenCount = count[i];
            }
        }

        return mostSeenIndex;
    }
}
