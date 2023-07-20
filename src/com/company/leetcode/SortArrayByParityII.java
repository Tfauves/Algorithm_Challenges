package com.company.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArrayByParityII {
    public static void main(String[] args) {
        int[] input = {4,2,5,7};

        sortIt(input);

    }

    public static int[] sortIt(int[] nums) {
        // Given an array of integers nums, half of the integers in nums are odd,
        // and the other half are even.Sort the array so that whenever nums[i] is odd,
        // i is odd, and whenever nums[i] is even, i is even.

        List<Integer> odds = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();

        for (int num : nums) {
            if (num % 2 == 0) {
                evens.add(num);
            } else {
                odds.add(num);
            }
        }

        int[] ans = new int[nums.length];

        for (int i = 0; i < ans.length; i++) {
            if (i % 2 == 0) {
                ans[i] = evens.get(i / 2);
            } else {
                ans[i] = odds.get(i / 2);
            }
        }


//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] % 2 == 0) {
//                evens.add(nums[i]);
//            } else {
//                odds.add(nums[i]);
//            }
//        }
//
//        System.out.println(evens);
//        System.out.println(odds);
//
//        int[] ans = new int[nums.length];
//
//        for (int i = 0; i < ans.length; i++) {
//            if (i % 2 == 0) {
//                ans[i] = evens.get(i);
//            } else {
//                ans[i] = odds.get(i -1);
//            }
//        }


        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
