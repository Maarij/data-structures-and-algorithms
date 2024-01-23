package main.java.strivers.step2.sorting1;

import java.util.Arrays;
import java.util.List;

/**
 * QuickSort is a sorting algorithm based on the Divide and Conquer algorithm that picks an element as a pivot and
 * partitions the given array around the picked pivot by placing the pivot in its correct position in the sorted array.
 */
public class P7QuickSort {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(13, 46, 24, 52, 20, 9);
        quickSort(list);

        for (int i : list) {
            System.out.print(i + " ");
        }
    }

    public static void quickSort(List<Integer> arr) {
        // Write your code here.
        qs(arr, 0, arr.size() - 1);
    }

    static void qs(List<Integer> arr, int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            qs(arr, low, pIndex - 1);
            qs(arr, pIndex + 1, high);
        }
    }

    static int partition(List<Integer> arr, int low, int high) {
        int pivot = arr.get(low);
        int i = low;
        int j = high;

        while (i < j) {
            while (arr.get(i) <= pivot && i <= high - 1) {
                i++;
            }

            while (arr.get(j) > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, temp);
        return j;
    }
}
