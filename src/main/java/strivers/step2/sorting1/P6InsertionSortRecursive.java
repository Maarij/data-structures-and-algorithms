package main.java.strivers.step2.sorting1;

public class P6InsertionSortRecursive {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        insertionSort(arr, 0, arr.length);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void insertionSort(int[] arr, int i, int n) {
        // Base Case: i == n.
        if (i == n) return;

        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }

        insertionSort(arr, i + 1, n);
    }
}
