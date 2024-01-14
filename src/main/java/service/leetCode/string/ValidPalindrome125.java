package main.java.service.leetCode.string;

public class ValidPalindrome125 {

    // Input: s = "A man, a plan, a canal: Panama" -> true
    // Input: s = "race a car" -> false
    // TC: O(n)
    // SC: O(n)
    public boolean isPalindrome(String s) {
        String letterOrDigitString = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                letterOrDigitString += s.charAt(i);
            }
        }

        letterOrDigitString = letterOrDigitString.toLowerCase();

        for (int i = 0; i < letterOrDigitString.length() / 2; i++) {
            char beginning = letterOrDigitString.charAt(i);
            char end = letterOrDigitString.charAt(letterOrDigitString.length() - 1 - i);

            if (beginning != end) {
                return false;
            }
        }

        return true;
    }
}
