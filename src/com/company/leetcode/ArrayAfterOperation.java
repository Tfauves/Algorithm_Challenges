package com.company.leetcode;

import java.util.Arrays;

public class ArrayAfterOperation {

    public static void main(String[] args) {
        int[] input = {847,847,0,0,0,399,416,416,879,879,206,206,206,272};

        applyOperations(input);

    }

    public static int[] applyOperations(int[] nums) {

        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i] == nums[i + 1]) {
                int product = nums[i] * 2;
                nums[i] = product;
               nums[i + 1] = 0;
            }
        }
        System.out.println(Arrays.toString(nums));
        int nonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }

        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }
}
