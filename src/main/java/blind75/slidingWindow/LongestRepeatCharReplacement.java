package main.java.blind75.slidingWindow;

import java.util.HashMap;

/**
 * <a href="https://leetcode.com/problems/longest-repeating-character-replacement/description/">424. Longest Repeating Character Replacements</a>
 * <br>
 * <br>
 * You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character.
 * You can perform this operation at most k times.
 * <p>
 * Return the length of the longest substring containing the same letter you can get after performing the above operations.
 */
public class LongestRepeatCharReplacement {
    public static void main(String[] args) {
        System.out.println(characterReplacement("ABABBA", 2));
    }

    private static int characterReplacement(String s, int k) {
        HashMap<Character, Integer> count = new HashMap<>();
        int res = 0;

        int l = 0, maxf = 0;
        for (int r = 0; r < s.length(); r++) {
            count.put(s.charAt(r), count.getOrDefault(s.charAt(r), 0) + 1);
            maxf = Math.max(maxf, count.get(s.charAt(r)));

            while ((r - l + 1) - maxf > k) {
                count.put(s.charAt(l), count.get(s.charAt(l)) - 1);
                l++;
            }
            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}