package main.java.service.strivers.patternproblems;

public class P22Number {
    public static void main(String[] args) {
        int N = 3;

        // Outer loop for no. of rows
        for (int i = 0; i < 2 * N - 1; i++) {

            // inner loop for no. of columns.
            for (int j = 0; j < 2 * N - 1; j++) {

                // Initialising the top, down, left and right indices of a cell.
                int distanceFromTop = i;
                int distanceFromLeft = j;
                int distanceFromRight = (2 * N - 2) - j;
                int distanceFromBottom = (2 * N - 2) - i;

                // Min of 4 directions and then we subtract from n
                // because previously we would get a pattern whose border
                // has 0's, but we want with border N's and then decrease inside.
                System.out.print(N - Math.min(Math.min(distanceFromTop, distanceFromBottom), Math.min(distanceFromLeft, distanceFromRight)) + " ");
            }

            // As soon as the numbers for each iteration are printed, we move to the
            // next row and give a line break otherwise all numbers
            // would get printed in 1 line.
            System.out.println();
        }
    }
}
