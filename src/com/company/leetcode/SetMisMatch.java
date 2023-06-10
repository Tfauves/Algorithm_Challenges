package com.company.leetcode;

import java.util.Arrays;

public class SetMisMatch {
    public static void main(String[] args) {
        int[] input = {1, 2, 2, 4};

        findErrorNums(input);

    }

    public static int[] findErrorNums(int[] nums) {


        // if input not sorted: sort nums
        // iterate nums
        // compare value at i to next looking for equality
        // when two values are equal add that value to the answer arr
        // calculate which value is missing ie the value that should be there in order
        // if i = i+1 add i+1 to answer then - i+1 from i+1+1
        // add this calculated value to the answer arr
        // if i+1+1 does not exsist then add 1 to the value at i+1
        // return answer array

        int[] answer = new int[2];
        int answerIndex = 0;
        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i] == nums[i +1]) {
                answer[answerIndex] = nums[i +1];
                int missingValue = nums[i + 1 +1] - 1;
                answer[answerIndex + 1] = missingValue;
                answerIndex++;
            }

        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
