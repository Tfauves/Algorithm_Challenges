package com.company.leetcode;

public class CountOnes {
    public static void main(String[] args) {
        int[] input = {1,0,1,1,0,1, 1, 1, 1};

        findOnes(input);
    }

    public static int findOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;

        for (int num : nums) {

            if (num == 1) {
                count++;
            } else {
                count = 0;
            }
            if (count > maxCount) maxCount = count;
        }

        System.out.println(maxCount);
        return maxCount;
    }
}
