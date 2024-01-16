package main.java.hackerrank.threemonth.week1;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P2MiniMaxSum {

    public static void main(String[] args) throws IOException {
        List<Integer> arr = Stream.of(256741038, 623958417, 467905213, 714532089, 938071625).collect(Collectors.toList());
        miniMaxSum(arr);
    }

    /*
     * Complete the 'miniMaxSum' function below.
     */
    public static void miniMaxSum(List<Integer> arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        long sum = 0;

        for (int i : arr) {
            if (i > max) max = i;
            if (i < min) min = i;
            sum += i;
        }

        System.out.println(String.format("%d %d", sum - max, sum - min));
    }
}
