package main.java.leetCode.string;

import java.util.Objects;

public class LongestCommonPrefix14 {

    public static void main(String[] args) {
        LongestCommonPrefix14 longestCommonPrefix14 = new LongestCommonPrefix14();
        System.out.println(longestCommonPrefix14.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    // TC: O(n*m)
    // SC: O(m)
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            if (Objects.equals(prefix, "")) {
                return "";
            }

            String tempString = "";

            int searchSize = Math.min(prefix.length(), strs[i].length());

            for (int j = 0; j < searchSize; j++) {
                if (prefix.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
                tempString += strs[i].charAt(j);
            }
            prefix = tempString;
        }

        return prefix;
    }
}
