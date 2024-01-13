package main.java.service.strivers.patternproblems;

public class P6InvertedNumberedRightPyramid {
    public static void main(String[] args) {
        int N = 3;

        // 123
        // 12
        // 1
        for (int i = 0; i < N; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        for (int i = 0; i < N; i++) {
            for (int j = N; j > i; j--) {
                System.out.print(N-j+1);
            }
            System.out.println();
        }
    }
}
