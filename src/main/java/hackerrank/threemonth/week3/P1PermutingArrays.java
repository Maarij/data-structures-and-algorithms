package main.java.hackerrank.threemonth.week3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P1PermutingArrays {
    public static void main(String[] args) {
        System.out.println(twoArrays(1, Arrays.asList(0, 1), Arrays.asList(0, 2)));
    }

    public static String twoArrays(int k, List<Integer> a, List<Integer> b) {
        Collections.sort(a);
        Collections.sort(b);

        Collections.reverse(b);

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) + b.get(i) < k) {
                return "NO";
            }
        }

        return "YES";
    }
}
