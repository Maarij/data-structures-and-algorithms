package main.java.blind75.binarySearch;

/**
 * <a href="https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/">153. Find Minimum in Rotated Sorted Array</a>
 * <br>
 * <br>
 * Suppose an array of length n sorted in ascending order is rotated between 1 and n times.
 * Given the sorted rotated array nums of unique elements, return the minimum element of this array.
 * You must write an algorithm that runs in O(log n) time.
 */
public class MinRotatedSortedArray {

    public static void main(String[] args) {
        System.out.println(findMin(new int[]{0, 1, 2, 3, 4, 5, 6}));
        System.out.println(findMin(new int[]{3, 4, 5, 1, 2}));
        System.out.println(findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
        System.out.println(findMin(new int[]{11, 13, 15, 17}));
    }

    private static int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int m = (l + r) / 2;
            if (nums[m] < nums[r])
                r = m;
            else
                l = m + 1;
        }

        return nums[l];
    }
}
