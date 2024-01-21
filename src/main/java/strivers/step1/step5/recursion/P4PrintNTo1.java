package main.java.strivers.step1.step5.recursion;

public class P4PrintNTo1 {
    public static void main(String[] args) {
        printRecursively(5);
    }

    private static void printRecursively(int n) {
        if (n == 0) return;
        System.out.println(n);
        printRecursively(--n);
    }
}
