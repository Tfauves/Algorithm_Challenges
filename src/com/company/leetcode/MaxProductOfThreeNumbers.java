package com.company.leetcode;

import java.util.Arrays;

public class MaxProductOfThreeNumbers {
    public static void main(String[] args) {
        int[] input = {-1,-2,-3};

        System.out.println(maximumProduct(input));

    }

    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int product2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(product1, product2);
    }
}
