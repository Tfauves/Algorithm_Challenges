package com.company.leetcode;

import java.util.Arrays;

public class ArrayPartition {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4};

        arrayPairSum(input);

    }

    public static int arrayPairSum(int[] nums) {
        int maxSum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length -1; i += 2) {
            maxSum += nums[i];
        }

        return maxSum;
    }
}
