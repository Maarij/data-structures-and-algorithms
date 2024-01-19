package main.java.strivers.step2;

public class P3Print1ToN {
    public static void main(String[] args) {
        printRecursively(1, 5);
    }

    private static void printRecursively(int i, int n) {
        if (i > n) return;
        System.out.println(i);
        printRecursively(i + 1, n);
    }
}
