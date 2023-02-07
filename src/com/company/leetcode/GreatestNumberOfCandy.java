package com.company.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreatestNumberOfCandy {
    public static void main(String[] args) {
        int [] test = {2,3,5,1,3};
        int candies = 3;

        kidsWithCandies(test, candies);

    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> bools = new ArrayList<>();
        List<Integer> candiesPlusExtra = new ArrayList<>();
        int candyMax = 0;

        for (int candy : candies) {
            if (candy > candyMax) {
                candyMax = candy;
            }
           int plusCandies = candy + extraCandies;
            candiesPlusExtra.add(plusCandies);
        }
        for (Integer candy : candiesPlusExtra) {
            if (candyMax <= candy) {
                bools.add(true);
            } else {
                bools.add(false);
            }
        }

        System.out.println(bools);
        return bools;
    }
}
