package main.java.blind75.arraysAndHashing;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/two-sum/description/">1. Two Sum</a>
 * <br>
 * <br>
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * <br>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <br>
 * You can return the answer in any order.
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] output = twoSum(new int[]{2, 7, 11, 15}, 9);

        for (int i : output) {
            System.out.print(i + " ");
        }
    }

    // TC: o(n)
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (seen.containsKey(target - nums[i])) {
                return new int[]{seen.get(target - nums[i]), i};
            } else {
                seen.put(nums[i], i);
            }
        }

        return new int[]{};
    }
}
