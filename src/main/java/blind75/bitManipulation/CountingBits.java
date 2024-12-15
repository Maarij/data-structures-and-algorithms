package main.java.blind75.bitManipulation;

/**
 * <a href="https://leetcode.com/problems/counting-bits/description/">338. Counting Bits</a>
 * <br>
 * <br>
 * Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the
 * number of 1's in the binary representation of i.
 */
public class CountingBits {
    public static void main(String[] args) {
        for (int i : countBits(5)) {
            System.out.print(i + " ");
        }
    }

    public static int[] countBits(int n) {
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i >> 1] + (i & 1);
        }

        return dp;
    }
}
