package com.company.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// TODO: 4/1/2023 need to handle duplicate values??? 
public class FindAllNumbersDisappearednArray {
    public static void main(String[] args) {

        int[] input = {1,1};
        findDisappearedNumbers(input);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> misVals = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length -1; i++) {
            int diff = nums[i + 1] - nums[i];
            if (nums[i] < nums[i + 1]) {
                if (diff == 0) continue;
                if (diff > 1) {
                    for (int j = nums[i] + 1; j < nums[i + 1]; j++) {
                        misVals.add(j);
                    }
                }


            }

        }

        System.out.println(misVals);
        return misVals;
    }
}
