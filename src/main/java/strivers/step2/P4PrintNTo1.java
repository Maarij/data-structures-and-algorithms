package main.java.strivers.step2;

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
