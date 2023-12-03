package com.company.leetcode;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInArray {
    public static void main(String[] args) {
        int[] input = {5,7,7,8,8,10};
        int target = 8;

        System.out.println(searchRange(input, target));

    }

    public static int[] searchRange(int[] nums, int target) {
        int[] startAndEndIndices = new int[2];
        int startIndex = startAndEndIndices[0];
        int endIndex = startAndEndIndices[1];




        System.out.println(Arrays.toString(startAndEndIndices));
        return startAndEndIndices;
    }
}
