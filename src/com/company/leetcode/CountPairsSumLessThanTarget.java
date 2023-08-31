package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

public class CountPairsSumLessThanTarget {
    public static void main(String[] args) {
        int[] arr = {-6,2,5,-2,-7,-1,3};
        List<Integer> input = new ArrayList<>();
        for (int num : arr) {
            input.add(num);
        }

        int target = -2;

        countPairs(input, target);

    }

    public static int countPairs(List<Integer> nums, int target) {

        int pairCount = 0;

        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                int check = nums.get(i) + nums.get(j);
                if (check < target) pairCount++;
            }
        }

        System.out.println(pairCount);
        return pairCount;
    }
}
