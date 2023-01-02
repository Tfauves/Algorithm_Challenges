package com.company.leetcode;

import java.util.Arrays;

public class NumsSmallerThanCurrent {
    public static void main(String[] args) {
        int[] test = {8,1,2,2,3};

        smallerNumbersThanCurrent(test);

    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] smallNums = new int[nums.length];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {

                if (nums[i] > nums[j]) {
                    count += 1;
                }
            }
            smallNums[i] = count;
            count = 0;
        }


        System.out.println(Arrays.toString(smallNums));
        return smallNums;
    }
}

