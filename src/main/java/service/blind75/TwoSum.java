package main.java.service.blind75;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] indices = twoSumValuesSeen(new int[]{2, 7, 11, 15}, 9);
        System.out.println(indices);

        indices = twoSumValuesSeen(new int[]{3, 2, 4}, 6);
        System.out.println(indices);

        indices = twoSumValuesSeen(new int[]{3, 3}, 6);
        System.out.println(indices);
    }

    // TC: O(n)
    // SC: O(n)
    public static int[] twoSumValuesSeen(int[] nums, int target) {
        Map<Integer, Integer> valuesSeen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complementTarget = target - nums[i];

            if (valuesSeen.containsKey(complementTarget)) {
                return new int[]{valuesSeen.get(complementTarget), i};
            }

            valuesSeen.put(nums[i], i);
        }

        throw new IllegalStateException();
    }

    public static int[] twoSumComplement(int[] nums, int target) {
        Map<Integer, Integer> dictionary = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            dictionary.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (dictionary.containsKey(target - nums[i]) && i != dictionary.get(target - nums[i])) {
                return new int[]{i, dictionary.get(target - nums[i])};
            }
        }

        throw new IllegalStateException();
    }

    // TC: O(n^2)
    // SC: O(1)
    public static int[] twoSumBrute(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        throw new IllegalStateException();
    }
}
