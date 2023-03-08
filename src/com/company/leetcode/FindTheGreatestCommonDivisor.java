package com.company.leetcode;

import java.util.Arrays;

public class FindTheGreatestCommonDivisor {
    public static void main(String[] args) {
        int[] input = {6,7,9};

        findGCD(input);

    }

    public static int findGCD(int[] nums) {
        int GCD = 1;
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length -1];

//        System.out.println(min);
//        System.out.println(max);

        if (min == max) return min;

        for (int i = 1; i < max; i++) {
            if (min % i == 0 && max % i == 0) {
                if (i > GCD) {
                    GCD = i;
                }
            }
        }

        System.out.println(GCD);
        return GCD;
    }
}
