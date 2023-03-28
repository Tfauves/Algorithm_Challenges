package com.company.leetcode;

public class MaximumProductOfTwoElementsInArray {
    public static void main(String[] args) {

        int[] input = {1, 5, 4, 5};
        maxProduct(input);
    }
    public static int maxProduct(int[] nums) {
        int maxProduct = 0;
        int maxVal = 0;
        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i] > maxVal) {
                maxVal = nums[i];
            }
            int j = i + 1;
            int product = (maxVal - 1) * (nums[j] - 1);

            if (product >= maxProduct) {
                maxProduct = product;
            }

        }

        System.out.println(maxProduct);
        return maxProduct;
    }
}
