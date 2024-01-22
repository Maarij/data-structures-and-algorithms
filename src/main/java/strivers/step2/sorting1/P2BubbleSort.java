package main.java.strivers.step2.sorting1;

/**
 * Traverse from left and compare adjacent elements and the higher one is placed at right side.
 * In this way, the largest element is moved to the rightmost end at first.
 * This process is then continued to find the second largest and place it and so on until the data is sorted.
 */
public class P2BubbleSort {
    public static void main(String[] args) {
        int[] sorted = bubbleSort(new int[]{13, 46, 24, 52, 20, 9});
        for (int i : sorted) {
            System.out.print(i + " ");
        }
    }

    // 13, 46, 24, 52, 20, 9
    //

    private static int[] bubbleSort(int[] arr) {
        boolean swapped;

        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }

        return arr;
    }
}
