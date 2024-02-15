package main.java.hackerrank.threemonth.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P6MaxPerimeterTriangle {
    public static void main(String[] args) {
        List<Integer> lengths = maximumPerimeterTriangle(Arrays.asList(1, 2, 3, 4, 5, 10));

        for (int i : lengths) {
            System.out.print(i + ",");
        }
    }

    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        List<Integer> lengths = new ArrayList<>();

        sticks.sort(Integer::compareTo);

        for (int i = 0; i + 2 < sticks.size(); i++) {
            if (sticks.get(i) + sticks.get(i + 1) > sticks.get(i + 2)) {
                lengths = Arrays.asList(sticks.get(i), sticks.get(i + 1), sticks.get(i + 2));
            }
        }

        if (lengths.isEmpty()) {
            return Arrays.asList(-1);
        }

        return lengths;
    }

    private boolean constraint1(int a, int b, int c) {
        return a + b > c;
    }

    private boolean constraint2(int a, int b, int c) {
        return b + c > a;
    }

    private boolean constraint3(int a, int b, int c) {
        return c + a > b;
    }

}
