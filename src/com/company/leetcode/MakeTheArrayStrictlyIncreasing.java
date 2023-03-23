package com.company.leetcode;

public class MakeTheArrayStrictlyIncreasing {
    public static void main(String[] args) {
        int[] input = {105, 924, 32, 968};

        canBeIncreasing(input);

    }

    public static boolean canBeIncreasing(int[] nums) {
        int outOfSequence = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i -1]) {
                outOfSequence++;
            }

            if (i > 1 && nums[i] <= nums[i-2]) {
                nums[i] = nums[i -1];
            }
        }

        if(outOfSequence <= 1) {
            System.out.println(true);
            return true;
        }

        System.out.println(false);
        return false;
    }
}
