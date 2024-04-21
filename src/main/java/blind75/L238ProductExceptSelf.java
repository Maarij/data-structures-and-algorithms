package main.java.blind75;

/**
 * https://leetcode.com/problems/product-of-array-except-self/description/
 */
public class L238ProductExceptSelf {
    public static void main(String[] args) {
        int[] result = product(new int[]{1, 2, 3, 4});

        for (int i : result) {
            System.out.println(i);
        }
    }

    private static int[] product(int[] nums) {
        int[] result = new int[nums.length];

        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix;
            prefix *= nums[i];
        }

        prefix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= prefix;
            prefix *= nums[i];
        }

        return result;
    }
}
