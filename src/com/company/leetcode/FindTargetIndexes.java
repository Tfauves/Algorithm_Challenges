package com.company.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndexes {
    public static void main(String[] args) {

        int[] test = {1,2,5,2,3};
        int target = 2;

        targetIndices(test, target);
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> listOIndices = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) listOIndices.add(i);
        }

        System.out.println(listOIndices);

        return listOIndices;
    }
}
