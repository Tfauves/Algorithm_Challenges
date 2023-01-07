package com.company.leetcode;

// TODO: 1/7/2023 not passing all cases 
public class IceCreamBars {
    public static void main(String[] args) {
        int [] test = {7,3,3,6,6,6,10,5,9,2};

        maxIceCream(test, 56);
    }
    public static int maxIceCream(int[] costs, int coins) {
        int maxPrice = 0;
        int maxBar = 0;

        for (int cost : costs) {
            if (cost > coins) return 0;
            if (maxPrice == coins) break;
            maxPrice += cost;
        }
        maxBar = maxPrice - coins;
        if (maxPrice >= coins) return maxBar;

        if (maxPrice <= coins) return costs.length;

        return maxBar;

    }
}
