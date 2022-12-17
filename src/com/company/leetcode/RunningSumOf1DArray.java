package com.company.leetcode;

import java.util.Arrays;

public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4};

        runningSum(test);

    }

    public static int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        int len = nums.length;
        int sum = 0;

        for (int i = 0; i < len; i++) {

            sum += nums[i];
            runningSum[i] = sum;

        }
        System.out.println(Arrays.toString(runningSum));
        return runningSum;
    }
}
