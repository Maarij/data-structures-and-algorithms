package main.java.strivers.step1.step5.recursion;

public class P8Palindrome {
    public static void main(String[] args) {
        String s = "a man, a plan, a canal: panama";
        System.out.println(isPalindrome(s, 0, s.length() - 1));
    }

    private static boolean isPalindrome(String s, int start, int end) {
        if (start == end) {
            return true;
        }

        if (!Character.isLetterOrDigit(s.charAt(start))) {
            return isPalindrome(s, ++start, end);
        } else if (!Character.isLetterOrDigit(s.charAt(end))) {
            return isPalindrome(s, start, --end);
        }

        return s.charAt(start) == s.charAt(end) && isPalindrome(s, ++start, --end);
    }
}
