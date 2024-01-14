package main.java.service.leetCode.string;

public class ReverseInteger7 {

    public static void main(String[] args) {
        ReverseInteger7 reverseInteger7 = new ReverseInteger7();
        System.out.println(reverseInteger7.reverse(123));
    }

    // TC: O(log(n))
    // SC: O(1)
    public int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int remainder = x % 10;
            int temp = (result * 10) + remainder;

            if ((temp - remainder) / 10 != result) {
                return 0;
            }

            x = x / 10;
            result = temp;
        }

        return result;
    }
}
