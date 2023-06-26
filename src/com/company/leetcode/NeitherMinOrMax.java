package com.company.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NeitherMinOrMax {
    public static void main(String[] args) {
        int[] input = {3, 2, 1, 4};
        findNonMinOrMax(input);

    }

    public static int findNonMinOrMax(int[] nums) {
        List<Integer> valueList = new ArrayList<>();

        if (nums.length < 3) return -1;

        for (int i = 0; i < nums.length; i++) {
            valueList.add(nums[i]);
        }

        valueList.remove(Collections.max(valueList));
        valueList.remove(Collections.min(valueList));

        System.out.println(Collections.min(valueList));
        return Collections.min(valueList);

    }
}
