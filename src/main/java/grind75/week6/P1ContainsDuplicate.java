package main.java.grind75.week6;

import java.util.HashSet;
import java.util.Set;

public class P1ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1}));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> numsChecked = new HashSet<>();

        for (int num : nums) {
            if (!numsChecked.add(num)) {
                return true;
            }
        }

        return false;
    }
}
