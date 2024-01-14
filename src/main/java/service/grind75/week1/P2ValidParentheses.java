package main.java.service.grind75.week1;

import java.util.Stack;

public class P2ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("((]"));
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("("));
        System.out.println(isValid("(("));
        System.out.println(isValid("){"));
        System.out.println(isValid("(){}}{"));
    }

    // SC: O(n)
    // TC: O(n)
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (Character c : s.toCharArray()) {
            if (c.equals('(')) {
                stack.push(')');
            } else if (c.equals('{')) {
                stack.push('}');
            } else if (c.equals('[')) {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
