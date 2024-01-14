package main.java.service.grind75.week1;

public class P5ValidPalindrome {
    public static void main(String[] args) {
//        String input = "A man, a plan, a canal: Panama";
        String input = "race a car";

        if (input.isEmpty()) {
            System.out.println(true);
            return;
        }

        int startIndex = 0;
        int lastIndex = input.length() - 1;

        while (startIndex <= lastIndex) {
            char startChar = input.charAt(startIndex);
            char lastChar = input.charAt(lastIndex);

            if (!Character.isLetterOrDigit(startChar)) {
                startIndex++;
            } else if (!Character.isLetterOrDigit(lastChar)) {
                lastIndex--;
            } else {
                if (Character.toLowerCase(startChar) != Character.toLowerCase(lastChar)) {
                    System.out.println(false);
                    return;
                }

                startIndex++;
                lastIndex--;
            }
        }

        System.out.println(true);
    }
}
