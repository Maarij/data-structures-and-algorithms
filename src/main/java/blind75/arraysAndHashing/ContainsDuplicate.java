package main.java.blind75.arraysAndHashing;

import java.util.HashSet;

/**
 * <a href="https://leetcode.com/problems/contains-duplicate/description/">217. Contains Duplicate</a>
 * <br>
 * <br>
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1}));
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4}));
        System.out.println(containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num))
                return true;
            seen.add(num);
        }

        return false;
    }
}
