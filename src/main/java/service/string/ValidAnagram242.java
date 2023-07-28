package main.java.service.string;

public class ValidAnagram242 {

    // TC: O(n)
    // SC: O(1)
    public boolean isAnagram(String s, String t) {
        int[] charCounts = new int[26];

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
