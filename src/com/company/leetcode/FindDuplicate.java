package com.company.leetcode;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] test = {1,2,3,1};

        containsDuplicate(test);

    }

    public static boolean containsDuplicate(int[] nums) {
        boolean flag = false;
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int num : nums) {
            if (!numMap.containsKey(num)) {
                numMap.put(num, 1);
            } else {
                flag = true;
            }
        }

        System.out.println(numMap);
        System.out.println(flag);
        return flag;
    }
}
