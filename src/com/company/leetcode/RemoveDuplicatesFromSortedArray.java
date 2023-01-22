package com.company.leetcode;

import java.util.Arrays;

// TODO: 1/14/2023 stuck?????
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] test = {0,0,1,1,1,2,2,3,3,4};

        removeDuplicates(test);

    }

    public static int removeDuplicates(int[] nums) {
        int i = 1;
        int len = nums.length;
        while (i < len) {
            if (nums[i] == nums[i - 1]) {
                nums[i] = nums[len - 1];
                // reduce array size by one
                len--;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return len;
    }
}
