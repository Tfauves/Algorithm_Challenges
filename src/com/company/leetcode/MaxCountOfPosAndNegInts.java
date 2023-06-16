package com.company.leetcode;

public class MaxCountOfPosAndNegInts {
    public static void main(String[] args) {

        int[] input = {-2,-1,-1,1,2,3};

        maxOfInts(input);
    }

    public static int maxOfInts(int[] nums) {
        int posCount = 0;
        int negCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) posCount++;
            if (nums[i] < 0) negCount++;
        }
        System.out.println(Math.max(posCount, negCount));

        return Math.max(posCount, negCount);

    }
}
