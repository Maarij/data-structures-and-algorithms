package main.java.service.string;

public class ReverseString344 {

    // Input: s = ["h","e","l","l","o"]
    // Output: ["o","l","l","e","h"]
    public void reverseString(char[] s) {
        char temp;

        for (int i = 0; i < s.length / 2; i++) {
            temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }

        System.out.println(s);
    }
}
