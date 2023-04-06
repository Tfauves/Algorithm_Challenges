package com.company.leetcode;

public class HouseRobber {
    public static void main(String[] args) {
        int[] input = {1,2,3,1};

        rob(input);

    }

    public static int rob(int[] nums) {
        int len = nums.length;
        int[] lootOptions = new int[len];

        if (len == 0) return 0;
        if (len == 1) return nums[0];

        lootOptions[0] = nums[0];
        lootOptions[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < lootOptions.length; i++) {
            lootOptions[i] = Math.max(nums[i] + lootOptions[i -2], lootOptions[i -1]);
        }

        System.out.println(lootOptions[lootOptions.length -1]);
        return lootOptions[lootOptions.length - 1];
    }
}
