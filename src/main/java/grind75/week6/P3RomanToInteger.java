package main.java.grind75.week6;

public class P3RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }

    public static int romanToInt(String s) {
        int l = s.length();
        int result = 0;

        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);

            int add = 0;

            if (c == 'M')
                add = 1000;
            else if (c == 'D')
                add = 500;
            else if (c == 'C')
                add = 100;//===
            else if (c == 'L')
                add = 50;
            else if (c == 'X')
                add = 10;
            else if (c == 'V')
                add = 5;
            else if (c == 'I')
                add = 1;

            if (i < l - 1) {
                if (c == 'C' && s.charAt(i + 1) == 'D') {
                    add = 400;
                    ++i;
                } else if (c == 'C' && s.charAt(i + 1) == 'M') {
                    add = 900;
                    ++i;
                } else if (c == 'X' && s.charAt(i + 1) == 'L') {
                    add = 40;
                    ++i;
                } else if (c == 'X' && s.charAt(i + 1) == 'C') {
                    add = 90;
                    ++i;
                } else if (c == 'I' && s.charAt(i + 1) == 'V') {
                    add = 4;
                    ++i;
                } else if (c == 'I' && s.charAt(i + 1) == 'X') {
                    add = 9;
                    ++i;
                }

            }
            result += add;
        }

        return result;
    }
}
