package com.company.leetcode;

public class KeepMultiplyingFoundValuesByTwo {
    public static void main(String[] args) {
        int[] input = {8,19,4,2,15,3};
        int original = 2;

        findFinalValue(input, original);

    }

    public static int findFinalValue(int[] nums, int original) {
        int i = 0;

        while (i < nums.length) {
            if (nums[i] == original) {
                original = 2 * original;
                i = 0;
            } else {
                i++;
            }
        }


        System.out.println(original);
        return original;
    }

}
