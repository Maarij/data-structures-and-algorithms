package main.java.strivers.step1.step4.basicmath;

public class P7CheckIfPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(5));
        System.out.println(isPrime(7));
        System.out.println(isPrime(36));
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
