package main.java.service.array;

import java.util.Hashtable;

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
        Hashtable<Integer, Integer> valuesSeen = new Hashtable<>(); // value, index

        for (int i = 0; i < nums.length; i++) {
            int valueToSearchFor = Math.abs(target - nums[i]);

            if (valuesSeen.containsKey(valueToSearchFor)) {
                return new int[]{i, valuesSeen.get(valueToSearchFor)};
            }

            valuesSeen.put(nums[i], i);
        }


        return new int[]{};
    }
}
