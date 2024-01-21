package main.java.strivers.step1.step5.recursion;

public class P9FibonacciToN {
    public static void main(String[] args) {
        printToN(5);
        System.out.println();
        System.out.println(fibonacci(5));
    }

    private static void printToN(int n) {
        printToNRecursively(0, 0, 5);
    }

    private static void printToNRecursively(int start, int previous, int n) {
        if (start == n) {
            System.out.print(start + " ");
            return;
        }

        System.out.print(start + " ");
        printToNRecursively(start == 0 ? 1 : start + previous, start, n);
    }

    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int last = fibonacci(n - 1);
        int slast = fibonacci(n - 2);

        return last + slast;
    }
}
