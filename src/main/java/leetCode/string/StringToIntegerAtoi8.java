package main.java.leetCode.string;

public class StringToIntegerAtoi8 {

    public static void main(String[] args) {
        StringToIntegerAtoi8 service = new StringToIntegerAtoi8();
        System.out.println(service.myAtoi("123"));
    }

    // TC: O(n) where n is number of characters in s
    // SC: O(n)
    private int myAtoi(String s) {
        int index = 0;
        int sign = 1;
        int answer = 0;
        String trimmedString = s.trim();

        if (trimmedString.length() == 0) {
            return 0;
        }

        if (trimmedString.charAt(index) == '-') {
            sign = -1;
            index++;
        } else if (trimmedString.charAt(index) == '+') {
            index++;
        }

        while (index < trimmedString.length() && Character.isDigit(trimmedString.charAt(index))) {
            int digit = trimmedString.charAt(index) - '0';

            if (answer > Integer.MAX_VALUE / 10 || (answer == Integer.MAX_VALUE / 10) && digit > Integer.MAX_VALUE % 10) {
                if (sign == -1) {
                    return Integer.MIN_VALUE;
                }
                return Integer.MAX_VALUE;
            }

            answer = (answer * 10) + digit;
            index++;
        }

        return answer * sign;
    }
}
