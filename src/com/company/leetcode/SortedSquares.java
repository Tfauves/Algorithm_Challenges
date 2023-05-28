package com.company.leetcode;

import java.util.Arrays;

public class SortedSquares {
    public static void main(String[] args) {

        int[] input = {-4,-1,0,3,10};
        sortedSquares(input);

    }

    public static int[] sortedSquares(int[] nums) {
        int[] sortedAndSquaredValues = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int squaredValue = (int) Math.pow(nums[i], 2);
            sortedAndSquaredValues[i] = squaredValue;
        }

        Arrays.sort(sortedAndSquaredValues);
        System.out.println(Arrays.toString(sortedAndSquaredValues));
        return sortedAndSquaredValues;
    }
}
