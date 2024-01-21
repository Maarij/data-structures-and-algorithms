package main.java.strivers.step1.step5.recursion;

public class P2PrintNameNTimes {
    public static void main(String[] args) {
        printName(5);
    }

    private static void printName(int n) {
        printNameRecursively(1, n);
    }

    private static void printNameRecursively(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println("Maarij");
        printNameRecursively(i + 1, n);
    }
}
