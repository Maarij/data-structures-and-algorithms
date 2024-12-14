package main.java.blind75.dynamicProgramming;

/**
 * <a href="https://leetcode.com/problems/climbing-stairs/description/">70. Climbing Stairs</a>
 * <br>
 * <br>
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class ClimbingStairs {
    public static void main(String[] args){
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(3));
        System.out.println(climbStairs(4));
        System.out.println(climbStairs(5));
    }

    private static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int[] ways = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            if (i == 0 || i == 1) {
                ways[i] = 1;
            } else {
                ways[i] = ways[i - 1] + ways[i - 2];
            }
        }

        return ways[n];
    }

}
