package com.company.leetcode;

import java.util.Arrays;

public class IceCreamBars {
    public static void main(String[] args) {
        int [] test = {7,3,3,6,6,6,10,5,9,2};

        maxIceCream(test, 56);
    }
    public static int maxIceCream(int[] costs, int coins) {
        int barCount = 0;
        int rollingTotal = 0;

        Arrays.sort(costs);

        for (Integer cost : costs) {
            if (cost + rollingTotal <= coins) {
                barCount++;
                rollingTotal += cost;
            }
        }

        System.out.println(barCount);
        return barCount;
    }

    /// first attempt
//    public static int maxIceCream(int[] costs, int coins) {
//        int maxPrice = 0;
//        int maxBar = 0;
//        Arrays.sort(costs);
//
//        for (int cost : costs) {
//            if (cost > coins) return 0;
//            if (maxPrice == coins) break;
//            maxPrice += cost;
//        }
//        maxBar = maxPrice - coins;
//        if (maxPrice >= coins) return maxBar;
//
//        if (maxPrice <= coins) return costs.length;
//
//        System.out.println(maxBar);
//        return maxBar;
//
//    }
}
