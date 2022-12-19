package com.company.leetcode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {

        int [] test = {3, 3};

        twoSum(test, 6);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] targetIndices = new int[2];


        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    targetIndices[0] = i;
                    targetIndices[1] = j;

                }
            }
        }

        System.out.println(Arrays.toString(targetIndices));
        return  targetIndices;
    }
}
