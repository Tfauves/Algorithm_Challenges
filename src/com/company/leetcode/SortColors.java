package com.company.leetcode;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] input = {2,0,2,1,1,0};
        sortColors(input);

    }

    public static void sortColors(int[] nums) {

        int len = nums.length;

        for (int i = 0; i < len -1; i++) {
            for (int j = 0; j < len - i -1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                }
            }
        }

        System.out.println(Arrays.toString(nums));

    }
}
