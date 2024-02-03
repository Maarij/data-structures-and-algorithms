package main.java.grind75.week4;

public class P1ClimbingStairs {
    public static void main(String[] args){
        System.out.println(climbStairs(5));
    }

    // 1 -> 1
    // 2 -> 1/1, 1
    // 3 -> 1/1/1, 1/2, 2/1
    // 4 -> 1/1/1/1, 1/1/2, 1/2/1, 2/1/1, 2/2
    // 5 -> 1/1/1/1/1, 1/1/1/2, 1/1/2/1,
    private static int climbStairs(int n) {
        if (n < 2)
            return n;

        int[] ways = new int[n + 1];

        for (int i = 0; i < n + 1; i++) {
            if (i == 0 || i == 1) {
                ways[i] = 1;
            } else {
                ways[i] = ways[i - 1] + ways[i - 2];
            }
        }

        return ways[n];
    }

}
