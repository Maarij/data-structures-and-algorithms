package main.java.service.strivers.patternproblems;

public class P16AlphaRampPattern {
    public static void main(String[] args) {
        int N = 5;

        for (char i = 0; i < N; i++) {
            for (char j = 0; j <= i; j++) {
                System.out.print((char) ('A' + i));
            }
            System.out.println();
        }
    }
}
