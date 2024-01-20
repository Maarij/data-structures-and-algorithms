package main.java.strivers.step2;

public class P9FibonacciToN {
    public static void main(String[] args) {
        printToN(0, 0, 5);
        System.out.println();
        System.out.println(fibonacci(5));
    }

    private static void printToN(int start, int previous, int n) {
        if (start == n) {
            System.out.print(start + " ");
            return;
        }

        System.out.print(start + " ");
        printToN(start == 0 ? 1 : start + previous, start, n);
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
