package main.java.grind75.week4;

public class P2LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }

    private static int longestPalindrome(String s) {
        int[] count = new int[128];

        for (char ch : s.toCharArray())
            count[ch]++;

        int longestPalindrome = 0;

        for (int i = 0; i < 128; i++) {
            longestPalindrome += (count[i] / 2) * 2;

            if (longestPalindrome % 2 == 0 && count[i] % 2 == 1)
                longestPalindrome++;
        }

        return longestPalindrome;
    }
}
