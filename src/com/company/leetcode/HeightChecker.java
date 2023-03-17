package com.company.leetcode;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {

        int[] input = {1,2,3,4,5};
        heightChecker(input);

    }

    public static int heightChecker(int[] heights) {
        int expected = 0;
        int[] sorted = heights.clone();
        Arrays.sort(sorted);

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sorted[i]) expected++;
        }
        System.out.println(expected);
        return expected;
    }
}
