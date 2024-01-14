package main.java.service.leetCode.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217 {

    // Input: nums = [1,2,3,1]
    //                X     X
    // true
    // TC: O(n)
    // SC: O(n)
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numsChecked = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (numsChecked.contains(nums[i])) {
                return true;
            }
            numsChecked.add(nums[i]);
        }

        return false;
    }
}
