package main.java.hackerrank.threemonth.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P4DiagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();

//        arr.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
//        arr.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
//        arr.add(new ArrayList<>(Arrays.asList(9, 8, 9)));

        arr.add(new ArrayList<>(Arrays.asList(11, 2, 4)));
        arr.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        arr.add(new ArrayList<>(Arrays.asList(10, 8, -12)));

        System.out.println(diagonalDifference(arr));
    }

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */
    public static int diagonalDifference(List<List<Integer>> arr) {
        if (arr.isEmpty() || arr.size() < 2) {
            return 0;
        }

        int rows = arr.size();
        int columns = arr.get(0).size();

        int downwardDiagonal = 0;
        for (int i = 0; i < rows; i++) {
            downwardDiagonal += arr.get(i).get(i);
        }

        int upwardDiagonal = 0;
        for (int i = 0; i < rows; i++) {
            upwardDiagonal += arr.get(i).get(columns - i - 1);
        }

        return Math.abs(downwardDiagonal - upwardDiagonal);

    }
}
