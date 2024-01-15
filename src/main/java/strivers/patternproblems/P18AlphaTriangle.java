package main.java.strivers.patternproblems;

public class P18AlphaTriangle {
    public static void main(String[] args) {
        int N = 5;

        for (int i = 0; i < N; i++) {
            for (int j = N - 1 - i; j < N; j++) {
                System.out.print((char) ('A' + j));
            }
            System.out.println();
        }
    }
}
