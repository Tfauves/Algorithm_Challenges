package com.company.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
    public static void main(String[] args) {
        int[] input = {0, 1};

        missingNumber(input);

    }

    public static  int missingNumber(int[] nums) {

        Arrays.sort(nums);
        int maxValue = nums[nums.length -1];
        int[] newArray = new int[nums.length +1];

        for (int i = 0; i <= maxValue; i++) {
            newArray[i] = i;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != newArray[i]) {
                System.out.println(newArray[i]);
                return newArray[i];
            }
        }
        System.out.println(Arrays.toString(newArray));
        System.out.println(nums[nums.length -1] + 1);
        return nums[nums.length -1] + 1;

    }
}
