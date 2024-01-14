package main.java.service.leetCode.array;

public class RemoveDuplicatesFromSortedArray26 {

    public int removeDuplicates(int[] nums) {
        int lastUniqueIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[lastUniqueIndex] != nums[i]) {
                nums[lastUniqueIndex + 1] = nums[i];
                lastUniqueIndex++;
            }
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)

        return lastUniqueIndex + 1;
    }
}
