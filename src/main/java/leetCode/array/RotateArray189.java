package main.java.leetCode.array;

import java.util.Arrays;

public class RotateArray189 {

    // nums = [1,2,3,4,5,6,7], k = 3
    //        [5,6,7,1,2,3,4]
    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        // reverse entire array
        // [1,2,3,4,5,6,7] -> [7,6,5,4,3,2,1]
        reverse(nums, 0, nums.length - 1);

        // reverse first k elements
        reverse(nums, 0, k - 1);

        //reverse last nums.length - k elements
        reverse(nums, k, nums.length - 1);

        System.out.println(Arrays.toString(nums));
    }

    private void reverse(int[] nums, int start, int end) {

        // TC: O(n/2) -> O(n)
        // SC: O(1)

        while (start < end) {
            int temp = nums[start];

            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}
