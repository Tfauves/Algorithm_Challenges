package com.company.leetcode;

public class CountPairsWithAbsDiff {

    public int countKDifference(int[] nums, int k) {
        int pairCount = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = Math.abs(nums[i] - nums[j]);
                if(product == k) pairCount++;
            }
        }

        return pairCount;
    }
}
