package com.company.leetcode;

public class NumberOfGoodPairs {
    public static void main(String[] args) {

        int[] test = {1,2,3,1,1,3};

        numIdenticalPairs(test);

    }

    public static int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j] && i < j) {
                    goodPairs++;
                }
            }
        }

        System.out.println(goodPairs);
        return goodPairs;
    }
}
