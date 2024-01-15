package main.java.leetCode.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {

    // Input: nums = [2,7,11,15], target = 9
    //                x x
    // Output: [0,1]
    //
    // Input: nums = [3,2,4], target = 6
    //                  x x
    // Output: [1,2]
    // TC: O(n^2)
    // SC: O(1)
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }

    // Input: nums = [3,2,4], target = 6
    //                  x x
    // Output: [1,2]
    // TC: O(n)
    // SC: O(n)
    public int[] twoSumAdvanced(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndex.containsKey(complement)) {
                return new int[] {numToIndex.get(complement), i};
            }
            numToIndex.put(nums[i], i);
        }
        return new int[]{}; // No solution found!
    }
}
