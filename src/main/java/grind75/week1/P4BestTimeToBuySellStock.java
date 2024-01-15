package main.java.grind75.week1;

public class P4BestTimeToBuySellStock {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    // TC: O(n)
    // SC: O(1)
    public static int maxProfit(int[] prices) {
        int leastSoFar = Integer.MAX_VALUE;
        int overallProfit = 0;
        int priceSoldToday = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < leastSoFar) {
                leastSoFar = prices[i];
            }

            priceSoldToday = prices[i] - leastSoFar;
            if (priceSoldToday > overallProfit) {
                overallProfit = priceSoldToday;
            }
        }
        return overallProfit;
    }
}
