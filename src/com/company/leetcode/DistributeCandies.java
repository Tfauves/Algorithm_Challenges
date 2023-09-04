package com.company.leetcode;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
    public static void main(String[] args) {
        int[] input = {6, 6, 6, 6};

        distributeCandies(input);

    }
    public static int distributeCandies(int[] candyType) {
        Set<Integer> candySet = new HashSet<>();

        for (int type : candyType) {
            candySet.add(type);
        }

        int adviceAmt = candyType.length / 2;

        return Math.min(candySet.size(), adviceAmt);

//        if (candySet.size() <= adviceAmt) {
//            return candySet.size();
//        }
//
//        return adviceAmt ;
    }
}
