package com.company.leetcode;

public class CountEqualDivisiblePairs {
    public static void main(String[] args) {

        int[] input = {3,1,2,2,2,1,3};
        countPairs(input,2);
    }

    public static int countPairs(int[] nums, int k) {
        int validPairCount = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int indexCheck = i * j;
                if (nums[i] == nums[j] && indexCheck % k == 0) {
                    validPairCount++;
                }
            }
        }

        System.out.println(validPairCount);
        return validPairCount;
    }
}
