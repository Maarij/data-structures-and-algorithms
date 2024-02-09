package main.java.hackerrank.threemonth.week3;

import java.util.*;

public class P4SalesByMatch {
    public static void main(String[] args) {
        System.out.println(matchingSocks(9, Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20)));
    }

    private static int matchingSocks(int n, List<Integer> ar) {
        if (n < 2) {
            return 0;
        }

        int count = 0;
        Set<Integer> matches = new HashSet<>();

        for (int i : ar) {
            if (matches.contains(i)) {
                count++;
                matches.remove(i);
            } else {
                matches.add(i);
            }
        }

        return count;
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        int count = 0;

        Collections.sort(ar);

        for (int i = 1; i < n; i++) {
            if (Objects.equals(ar.get(i - 1), ar.get(i))) {
                ar.remove(i);
                ar.remove(i - 1);

                i--;
                n -= 2;
                count++;
            }
        }

        return count;
    }
}
