package main.java.hackerrank.threemonth.week2;

public class P3FlippingBits {
    public static void main(String[] args) {
        System.out.println(flippingBits(2147483647));
        System.out.println(flippingBitsUnsigned(2147483647));

        System.out.println(flippingBits(1));
        System.out.println(flippingBitsUnsigned(1));

        System.out.println(flippingBits(0));
        System.out.println(flippingBitsUnsigned(0));
    }

    public static long flippingBits(long n) {
        return (long) (Math.pow(2, 32) - (n + 1));
    }

    public static long flippingBitsUnsigned(long n) {
        return Integer.toUnsignedLong(~(int) n);
    }
}
