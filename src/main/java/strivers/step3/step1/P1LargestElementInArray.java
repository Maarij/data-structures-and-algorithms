package main.java.strivers.step3.step1;

public class P1LargestElementInArray {
    public static void main(String[] args) {
        System.out.println(findLargestElement(new int[]{2, 5, 1, 3, 0}));
    }

    private static int findLargestElement(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        if (arr.length == 1) return arr[0];

        int max = Integer.MIN_VALUE;
        for(int i : arr) {
            if (i > max) max = i;
        }

        return max;
    }
}
