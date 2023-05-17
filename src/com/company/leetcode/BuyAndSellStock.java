package com.company.leetcode;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] input = {7,1,5,3,6,4};

        maxProfit(input);

    }

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;

        for (int i = 0; i < prices.length; i++){

            if (prices[i] < min) {
                min = prices[i];
            }

            if (prices[i] - min > profit) {

                profit = prices[i]-min;
            }

        }

        return profit;
    }



    // first attempt failing time complexity
//    int maxProfit = 0;
//
//        for (int i = 0; i < prices.length; i++) {
//        for (int j = i + 1; j < prices.length; j++) {
//            int potentialProfit = prices[j] - prices[i];
//            if (potentialProfit > 0 && potentialProfit > maxProfit) {
//                maxProfit = potentialProfit;
//            }
//        }
//    }
//
//        System.out.println(maxProfit);
//        return maxProfit;
}
