package main.java.service.leetCode.string;

public class ReverseString344 {

    // Input: s = ["h","e","l","l","o"]
    // Output: ["o","l","l","e","h"]
    // TC: O(n)
    // SC: O(1)
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }

        System.out.println(s);
    }
}
