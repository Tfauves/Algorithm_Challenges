package com.company.leetcode;

import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] test = {0,2,1,5,3,4};

        buildFrom(test);
    }

    public static int[] buildFrom(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            ans[i] = nums[nums[i]];
        }

        System.out.println(Arrays.toString(ans));
        return ans;

    }

    // should return [0,1,2,4,5,3]
}
