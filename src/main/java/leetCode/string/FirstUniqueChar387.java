package main.java.leetCode.string;

import java.util.Hashtable;

public class FirstUniqueChar387 {

    // Input: s = "leetcode"
    // Output: 0
    // TC: O(n)
    // SC: O(n)
    public int firstUniqueChar(String s) {
        Hashtable<Character, Integer> hashtable = new Hashtable<>();
        for (int i = 0; i < s.length(); i++) {
            if (!hashtable.containsKey(s.charAt(i))) {
                hashtable.put(s.charAt(i), 1);
            } else {
                hashtable.put(s.charAt(i), hashtable.get(s.charAt(i)) + 1);
            }
        }


        for (int i = 0; i < s.length(); i++) {
            if (hashtable.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
