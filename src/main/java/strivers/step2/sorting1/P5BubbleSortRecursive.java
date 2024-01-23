package main.java.strivers.step2.sorting1;

public class P5BubbleSortRecursive {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};

        bubbleSort(arr, arr.length);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void bubbleSort(int[] arr, int n) {
        //Base case: range == 1.
        if (n == 1) return;

        for (int j = 0; j <= n - 2; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

        //Range reduced after recursion:
        bubbleSort(arr, n - 1);
    }
}
