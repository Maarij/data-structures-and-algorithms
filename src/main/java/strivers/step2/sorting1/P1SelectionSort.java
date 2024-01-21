package main.java.strivers.step2.sorting1;

/**
 * The algorithm repeatedly selects the smallest (or largest) element from the unsorted portion of the list and swaps
 * it with the first element of the unsorted part. This process is repeated for the remaining unsorted portion until
 * the entire list is sorted.
 */
public class P1SelectionSort {
    public static void main(String[] args) {
        selectionSort(new int[]{13, 46, 24, 52, 20, 9}, 6);
    }

    private static void selectionSort(int[] arr, int n) {
        int passes = 0;

        while (passes < n - 1) {
            int minPosition = passes;

            for (int i = passes; i < n; i++) {
                if (arr[i] < arr[minPosition]) {
                    minPosition = i;
                }
            }

            int temp = arr[passes];
            arr[passes] = arr[minPosition];
            arr[minPosition] = temp;

            passes++;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
