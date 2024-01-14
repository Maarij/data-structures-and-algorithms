package main.java.service.leetCode.array;

public class MoveZeroes283 {

    // Input: nums = [0,1,0,3,12]
    //                X   X
    // Output: [1,3,12,0,0]

    // TC: O(n)
    // SC: O(1)
    public void moveZeroes(int[] nums) {
        if (nums.length < 2) {
            return;
        }

        int lIndex = 0;
        int rIndex = 1;

        while (rIndex < nums.length) {
            if (nums[lIndex] != 0) {
                lIndex++;
                rIndex++;
            } else if (nums[rIndex] == 0) {
                rIndex++;
            } else if (nums[rIndex] != 0) {
                nums[lIndex] = nums[rIndex];
                nums[rIndex] = 0;
            }
        }
    }
}
