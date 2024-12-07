package main.java.blind75.arraysAndHashing;

/**
 * <a href="https://leetcode.com/problems/valid-anagram/description/">242. Valid Anagram</a>
 * <br>
 * <br>
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 */
public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }

    public static boolean isAnagram(String s, String t) {
        int[] count = new int[26];

        for (char x : s.toCharArray()) {
            count[x - 'a']++;
        }

        for (char x : t.toCharArray()) {
            count[x - 'a']--;
        }

        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }
}
