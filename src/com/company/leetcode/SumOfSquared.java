package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SumOfSquared {
    public static void main(String[] args) {
        int[] input = {2,7,1,19,18,3};

        System.out.println(sumOfSquares(input));

    }

    public static int sumOfSquares(int[] nums) {
        int len = nums.length;
        int sum = 0;

        for (int i = 0; i < len; i++) {
            if (len % (i + 1) == 0) {
                int specialSquared = nums[i] * nums[i];
                sum += specialSquared;
            }
        }

        return sum;
    }
}
