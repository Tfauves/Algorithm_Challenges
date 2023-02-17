package com.company.leetcode;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] input = {1,2,1};

        getConcatenation(input);

    }

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int [] ans = new int[n * 2];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
