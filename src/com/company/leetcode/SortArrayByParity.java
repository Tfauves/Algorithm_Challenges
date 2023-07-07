package com.company.leetcode;

import java.util.Arrays;

public class SortArrayByParity {

    public static void main(String[] args) {
        int[] input = {3, 1, 2, 4};

        solution(input);

    }

    public static int[] solution(int[] nums) {
        int[] ans = new int[nums.length];
        int findex = 0;
        int lindex = ans.length -1;

       for (int i = 0; i < nums.length; i++) {
           if (nums[i] % 2 == 0) {
               ans[findex] = nums[i];
               findex++;
           } else {
               ans[lindex] = nums[i];
               lindex--;
           }
       }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
