package main.java.strivers.step1.step4.basicmath;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1211));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        long reversed = 0;
        long temp = x;

        while (temp != 0) {
            int digit = (int) (temp % 10);
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return reversed == x;
    }
}
