package main.java.blind75.arraysAndHashing;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/product-of-array-except-self/description/">238. Product of Array Except Self</a>
 * <br>
 * <br>
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 */
public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] ints = productExceptSelf(new int[]{1, 2, 3, 4});
        for (int i : ints) {
            System.out.print(i + " ");
        }

        System.out.println();

        int[] ints2 = productExceptSelf(new int[]{-1, 1, 0, -3, 3});
        for (int i : ints2) {
            System.out.print(i + " ");
        }

    }

    private static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        Arrays.fill(ans, 1);

        int curr = 1;
        for (int i = 0; i < n; i++) {
            ans[i] *= curr;
            curr *= nums[i];
        }

        curr = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }

        return ans;
    }
}
