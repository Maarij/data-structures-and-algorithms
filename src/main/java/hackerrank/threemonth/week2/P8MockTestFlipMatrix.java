package main.java.hackerrank.threemonth.week2;

import java.util.List;

public class P8MockTestFlipMatrix {
    public static void main(String[] args) {

    }

    public static int flippingMatrix(List<List<Integer>> matrix) {
        int sum = 0;
        int size = matrix.size();

        for (int i = 0; i < size / 2; i++) {
            for (int j = 0; j < matrix.size() / 2; j++) {
                sum += Math.max(
                        matrix.get(i).get(j),
                        Math.max(
                                matrix.get(i).get(size - 1 - j),
                                Math.max(matrix.get(size - 1 - i).get(j),
                                        matrix.get(size - 1 - i).get(size - 1 - j)
                                )
                        )
                );
            }
        }
        return sum;
    }
}
