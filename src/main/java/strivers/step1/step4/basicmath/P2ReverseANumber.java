package main.java.strivers.step1.step4.basicmath;

public class P2ReverseANumber {
    public static void main(String[] args) {
        System.out.println(reverse(123));
    }

    public static int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int lastDigit = x % 10;

            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
                return 0;
            }

            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
                return 0;
            }

            result = result * 10 + lastDigit;
            x = x / 10;
        }

        return result;
    }
}
