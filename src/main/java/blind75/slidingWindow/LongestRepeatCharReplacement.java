package main.java.blind75.slidingWindow;

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
        int[] count = new int[128];
        int max = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            max = Math.max(max, ++count[s.charAt(end)]);

            if (max + k <= end - start)
                count[s.charAt(start++)]--;
        }

        return s.length() - start;
    }
}