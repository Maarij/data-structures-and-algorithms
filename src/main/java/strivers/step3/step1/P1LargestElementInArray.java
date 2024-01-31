package main.java.strivers.step3.step1;

import java.util.Arrays;

public class P1LargestElementInArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findSecondMinMax(new int[]{1, 2, 4, 7, 7, 5})));
        System.out.println(Arrays.toString(findSecondMinMax(new int[]{1})));
    }

    private static int[] findSecondMinMax(int[] arr) {
        if (arr == null) {
            return null;
        }

        if (arr.length == 1) {
            return new int[]{arr[0], arr[0]};
        }

        int secondMax = Integer.MIN_VALUE;
        int secondMin = Integer.MAX_VALUE;

        return new int[]{secondMin, secondMax};
    }
}
