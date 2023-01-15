package com.company.leetcode;

public class RemoveElement {
    public static void main(String[] args) {
        int[] test = {0,1,2,2,3,0,4,2};

        removeElement(test, 2);
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int len = nums.length;
        while (i < len) {
            if (nums[i] == val) {
                nums[i] = nums[len - 1];
                // reduce array size by one
                len--;
            } else {
                i++;
            }
        }
        return len;
    }
}