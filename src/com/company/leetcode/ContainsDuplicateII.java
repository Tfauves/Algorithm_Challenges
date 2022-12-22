package com.company.leetcode;

// TODO: 12/22/2022 passing most cases but fails time complexity.
public class ContainsDuplicateII {
    public static void main(String[] args) {

    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean isDup = false;


        for (int i = 0; i < nums.length -1; i ++) {
            for (int j = i +1; j < nums.length; j++) {
                if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
                    isDup = true;

                }
            }
        }

        return isDup;

    }
}
