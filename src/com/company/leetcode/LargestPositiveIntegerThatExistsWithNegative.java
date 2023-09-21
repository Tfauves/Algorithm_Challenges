package com.company.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LargestPositiveIntegerThatExistsWithNegative {
    public static void main(String[] args) {
        int[] input = {-10,8,6,7,-2,-3};

        System.out.println(findMaxK(input));

    }

    public static int findMaxK(int[] nums) {
        Set<Integer> uniqueNumElements = new HashSet<>();
        int maxK = -1;

        for(int num : nums) {
            uniqueNumElements.add(num);
        }

        for (int num : nums) {
            int negNum = -num;
            if (uniqueNumElements.contains(negNum) && num > maxK) {
                maxK = num;
            }
        }

        return maxK;
    }
}
