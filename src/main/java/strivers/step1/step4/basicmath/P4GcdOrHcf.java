package main.java.strivers.step1.step4.basicmath;

public class P4GcdOrHcf {
    public static void main(String[] args) {
        System.out.println(findGcd(6, 9));
    }

    // TC: O(log_o_min(a,b) where o=1.61
    // SC: O(1)
    public static int findGcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }

        return findGcd(num2, num1 % num2);
    }
}
