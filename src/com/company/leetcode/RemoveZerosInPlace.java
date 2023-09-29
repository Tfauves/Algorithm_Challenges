package com.company.leetcode;

import java.util.Arrays;

public class RemoveZerosInPlace {
    public static void main(String[] args) {
        int[] input = {0,1,0,3,12};

        moveZeroes(input);
    }

    public static void moveZeroes(int[] nums) {
        int nonZeroIndexTracker = 0;

        for(int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[nonZeroIndexTracker];
                nums[nonZeroIndexTracker] = temp;
                nonZeroIndexTracker++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
