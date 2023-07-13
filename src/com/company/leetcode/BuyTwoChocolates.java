package com.company.leetcode;

import java.util.Arrays;
import java.util.Collections;

public class BuyTwoChocolates {
    public static void main(String[] args) {
        int[] input = {3, 2, 3};
        int money = 3;

        buyChoco(input, money);

    }

    // to return the amount of money left after buying 2 chocolates
    // if money left is neg return money
    public static int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int minSum = prices[0] + prices[1];

        if (money - minSum < 0) {
            System.out.println(money);
            return money;
        } else {
            System.out.println(money - minSum);
            return money - minSum;
        }

    }
}
