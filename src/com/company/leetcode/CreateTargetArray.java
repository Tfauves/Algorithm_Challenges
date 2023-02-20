package com.company.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        // [0,4,1,3,2]
        createTargetArray(nums, index);

    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>();
        int[] output = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            target.add(index[i], nums[i]);
        }

        for (int i = 0; i < target.size(); i++) {
            output[i] = target.get(i);
        }

        return output;

    }
}
