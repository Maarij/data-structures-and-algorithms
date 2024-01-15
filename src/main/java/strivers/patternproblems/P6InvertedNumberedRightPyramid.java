package main.java.strivers.patternproblems;

public class P6InvertedNumberedRightPyramid {

    // 123
    // 12
    // 1
    public static void main(String[] args) {
        int N = 3;

        for (int i = 0; i < N; i++) {
            for (int j = N; j > i; j--) {
                System.out.print(N - j + 1);
            }
            System.out.println();
        }
    }
}
