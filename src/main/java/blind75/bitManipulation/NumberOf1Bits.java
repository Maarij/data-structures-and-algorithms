package main.java.blind75.bitManipulation;

/**
 * <a href="https://leetcode.com/problems/number-of-1-bits/description/">191. Number of 1 Bits</a>
 * <br>
 * <br>
 * Given a positive integer n, write a function that returns the number of set bits in its binary representation.
 */
public class NumberOf1Bits {
    public static void main(String[] args) {
        System.out.println(hammingWeight(4));
    }

    private static int hammingWeight(int n) {
        int setBitCount = 0;

        while (n != 0) {
            n &= (n - 1); // to clear the right most set bit
            ++setBitCount;
        }

        return setBitCount;
    }

    private static int hammingWeight2(int n) {
        int ones = 0;

        while (n != 0) {
            ones = ones + (n & 1);
            n = n >>> 1;
        }

        return ones;
    }
}
