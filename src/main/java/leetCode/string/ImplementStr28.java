package main.java.leetCode.string;

public class ImplementStr28 {

    public static void main (String[] args) {
        ImplementStr28 implementStr28 = new ImplementStr28();

        System.out.println(implementStr28.strStr("sadbutsad", "sad"));
    }

    private int strStr(String haystack, String needle) {
        int startingIndex = -1;
        int matchingChars = 0;

        for(int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(matchingChars)) {
                startingIndex = i;
                matchingChars++;
            } else {
                startingIndex = -1;
                matchingChars = 0;
            }

            if (matchingChars == needle.length()) {
                return startingIndex - matchingChars + 1;
            }
        }

        return startingIndex;
    }
}
