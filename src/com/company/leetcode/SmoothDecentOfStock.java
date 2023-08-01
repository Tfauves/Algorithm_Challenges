package com.company.leetcode;

// TODO: 8/1/2023 needs of work
public class SmoothDecentOfStock {
    public static void main(String[] args) {
        int[] input = {3,2,1,4};

        getDescentPeriods(input);

    }

    public static long getDescentPeriods(int[] prices) {

//Return the number of smooth descent periods.
// Note that a period with one day is a smooth descent period by the definition.

// length -1 smooth descents
// the price of the next day is lower than 1 on the day before

         // iterate the prices
        // if the price is -1 from the current price increase smooth descent price count
        // long smoothDescentPriceCount =  length -1 smooth descents

        long smoothDescentPriceCount = prices.length;

        for (int i = 0; i < prices.length; i++) {

            for (int j = i + 1; j < prices.length; j++) {
                int difference = prices[i] - prices[j];
                if (difference == 1) {
                    smoothDescentPriceCount++;
                }

            }
        }

        System.out.println(smoothDescentPriceCount);
        return smoothDescentPriceCount;


    }
}
