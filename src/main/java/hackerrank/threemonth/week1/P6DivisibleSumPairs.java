package main.java.hackerrank.threemonth.week1;


import java.util.Arrays;
import java.util.List;

// Given an array of integers and a positive integer k, determine the number of (i,j) pairs
// where i<j and ar[i]+ar[j] is divisible by k.
public class P6DivisibleSumPairs {
    public static void main(String[] args) {
        System.out.println(divisibleSumPairs(6, 5, Arrays.asList(1, 2, 3, 4, 5, 6)));
        System.out.println(divisibleSumPairs(6, 3, Arrays.asList(1, 3, 2, 6, 1, 26)));
    }

    private static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int divisibleSum = 0;

        for (int i = 0; i < ar.size() - 1; i++) {
            for (int j = i + 1; j < ar.size(); j++) {
                Integer iSum = ar.get(i);
                Integer jSum = ar.get(j);

                if ((iSum + jSum) % k == 0) {
                    divisibleSum++;
                }
            }
        }

        return divisibleSum;
    }
}
