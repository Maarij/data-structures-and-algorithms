package main.java.service.strivers;

public class P5InvertedRightPyramid {
    public static void main(String[] args) {
        int N = 3;

        // ***
        // **
        // *
        for (int i = 0; i < N; i++) {
            for (int j = N; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
