package main.java.strivers.step1.step4.basicmath;

public class P5ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(1634));
    }

    public static boolean isArmstrongNumber(int x) {
        int temp = x;
        int length = String.valueOf(x).length();
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;

            sum += Math.pow(digit, length);
            temp /= 10;
        }


        return sum == x;
    }
}
