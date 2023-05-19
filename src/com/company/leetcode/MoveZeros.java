package com.company.leetcode;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};

        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int len = nums.length;
        int left = 0;
        int right = 0;

        while (right < len) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }

        while (left < len) {
            nums[left] = 0;
            left++;
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
