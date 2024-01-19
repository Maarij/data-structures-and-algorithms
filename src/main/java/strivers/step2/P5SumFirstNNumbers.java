package main.java.strivers.step2;

public class P5SumFirstNNumbers {
    public static void main(String[] args){
        System.out.println(sumNumbers(5));
    }

    private static int sumNumbers(int n) {
        if (n==0) return 0;
        return n + sumNumbers(--n);
    }
}
