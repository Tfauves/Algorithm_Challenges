package com.company.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMisMatch {
    public static void main(String[] args) {
        int[] input = {1, 2, 2, 4};

        findErrorNums(input);
    }

    public static int[] findErrorNums(int[] nums) {
        int[] answer = new int[2];
        Set<Integer> mySet = new HashSet<>();

// adding the values from nums to the set
        for (int i = 0; i < nums.length; i++) {

           if (mySet.contains(nums[i])) {
// found a duplicate value and added it to answer[]
               answer[0] = nums[i];
           } else {
               mySet.add(nums[i]);
           }
        }

// find the duplicated number by checking if it already exists in the set.
// Then, we iterate from 1 to nums.length and check which number is missing
// by checking if it exists in the set.
// find the duplicated and missing numbers and store them in the answer array.
        for (int i = 1; i <= nums.length; i++) {
            if (!mySet.contains(i)) {
                answer[1] = i; // Found the missing number
                break;
            }
        }

//        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
