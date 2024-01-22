package main.java.strivers.step2.sorting1;

/**
 * Insertion sort is a simple sorting algorithm that works similar to the way you sort playing cards in your hands.
 * The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and placed
 * at the correct position in the sorted part.
 * <br>
 * <br>
 * To sort an array of size N in ascending order iterate over the array and compare the current element (key) to its
 * predecessor, if the key element is smaller than its predecessor, compare it to the elements before. Move the greater
 * elements one position up to make space for the swapped element.
 */
public class P3InsertionSort {
    public static void main(String[] args) {
        int[] sorted = insertionSort(new int[]{13, 46, 24, 52, 20, 9});

        for (int i : sorted) {
            System.out.print(i + " ");
        }
    }

    private static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;
        }

        return arr;
    }
}
