package com.company.leetcode;

import java.util.Arrays;

public class MaxSumWithExactlyKElements {
    public static void main(String[] args) {
        int[] input = {5, 5, 5};
        int k = 2;

        maximizeSum(input, k);

    }

    public static int maximizeSum(int[] nums, int k) {
        int max = 0;
        int score = 0;

        for (int num : nums) {
            max = Math.max(max, num);
        }

        while (k > 0) {
            score += max;
            max = max + 1;
            k--;
        }
        System.out.println(score);
        return score;
    }
}
