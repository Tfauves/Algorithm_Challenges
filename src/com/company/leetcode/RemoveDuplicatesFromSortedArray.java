package com.company.leetcode;

import java.util.Arrays;

// TODO: 1/14/2023 stuck?????
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] test = {1,1,2};

        removeDuplicates(test);

    }

    public static int removeDuplicates(int[] nums) {
        int moves = 0;
        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i + 1] = nums[i + 2];
                moves ++;
                nums[i + 2] = -1;
            }
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(nums.length -moves);
        return nums.length -moves;
    }
}
