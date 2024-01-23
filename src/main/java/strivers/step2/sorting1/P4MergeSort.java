package main.java.strivers.step2.sorting1;

/**
 * Merge sort is defined as a sorting algorithm that works by dividing an array into smaller subarrays, sorting
 * each subarray, and then merging the sorted subarrays back together to form the final sorted array.
 */
public class P4MergeSort {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        mergeSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void mergeSort(int[] arr) {
        if (arr.length < 2) {
            return;
        }

        int mid = arr.length / 2;
        int[] leftHalf = new int[mid];
        int[] rightHalf = new int[arr.length - mid];

        for (int i = 0; i < mid; i++) {
            leftHalf[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            rightHalf[i - mid] = arr[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(arr, leftHalf, rightHalf);
    }

    private static void merge(int[] arr, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                arr[k] = leftHalf[i];
                i++;
            } else {
                arr[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            arr[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            arr[k] = rightHalf[j];
            j++;
            k++;
        }
    }

}
