package com.company.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftAndRightSumDiff {
    public static void main(String[] args) {
        int[] input = {10,4,8,3};

        leftRigthDifference(input);

    }

    public static int[] leftRigthDifference(int[] nums) {
        int[] answer = new int[nums.length];
        int[] sumLeft = new int[nums.length];
        int[] sumRight = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
            }

            sumRight[i] = sum;
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            int sum = 0;

            for (int j = i - 1; j >= 0; j--) {
                sum += nums[j];
            }

            sumLeft[i] = sum;
        }

        for (int i = 0; i < nums.length; i++) {
            answer[i] = Math.abs(sumLeft[i] - sumRight[i]);
        }

//        System.out.println(Arrays.toString(answer));
        return answer;
    }

}
