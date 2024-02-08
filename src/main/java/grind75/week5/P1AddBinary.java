package main.java.grind75.week5;

public class P1AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
    }

    private static String addBinary(String a, String b) {
        int m = a.length() - 1;
        int n = b.length() - 1;
        int carry = 0;
        int sum = 0;

        StringBuilder out = new StringBuilder();

        while (m >= 0 || n >= 0 || carry == 1) {
            sum = carry;

            if (m >= 0) {
                sum = sum + a.charAt(m) - '0';
            }
            if (n >= 0) {
                sum = sum + b.charAt(n) - '0';
            }

            out.append((char) (sum % 2 + '0'));
            carry = sum / 2;

            m--;
            n--;
        }

        return out.reverse().toString();
    }
}
