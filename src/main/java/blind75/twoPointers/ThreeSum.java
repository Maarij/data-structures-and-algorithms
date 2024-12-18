package main.java.blind75.twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/3sum/description/">15. 3Sum</a>
 * <br>
 * <br>
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
 * such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 * <p>
 * Notice that the solution set must not contain duplicate triplets.
 */
public class ThreeSum {
    public static void main(String[] args) {
        List<List<Integer>> ans = threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        for (List<Integer> l : ans) {
            l.forEach(i -> System.out.print(i + " "));
            System.out.println();
        }
    }

    private static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int total = nums[i] + nums[j] + nums[k];

                if (total > 0) {
                    k--;
                } else if (total < 0) {
                    j++;
                } else {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;

                    while (nums[j] == nums[j - 1] && j < k) {
                        j++;
                    }
                }
            }
        }

        return ans;
    }
}
