package main.java.strivers.step1.step5.recursion;

public class P7ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 3, 2, 1};

        reverseArray(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void reverseArray(int[] arr, int start, int end) {
        if (start < end) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            reverseArray(arr, start + 1, end - 1);
        }
    }
}
