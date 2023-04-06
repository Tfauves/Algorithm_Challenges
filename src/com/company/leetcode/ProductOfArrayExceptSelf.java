package com.company.leetcode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4};

        productExceptSelf(input);

    }

    public static int[] productExceptSelf(int[] nums) {
        int runningProduct = 1;
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] output = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            left[i] = runningProduct;
            runningProduct *= nums[i];
        }

        runningProduct = 1;

        for (int i = nums.length -1; i >= 0; i--) {
            right[i] = runningProduct;
            runningProduct *= nums[i];
        }

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));

        for (int i = 0; i < right.length; i++) {
            output[i] = right[i] * left[i];
        }

        System.out.println(Arrays.toString(output));
        return output;
    }
}
