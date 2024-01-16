package main.java.strivers.step1.step4.basicmath;

public class P6PrintDivisors {
    public static void main(String[] args) {
        printDivisors(5);
    }

    private static void printDivisors(int n) {
        for (int i = 1; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i != n / i) System.out.print(n / i + " ");
            }
        }
    }

    private static void printDivisorsBruteForce(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
