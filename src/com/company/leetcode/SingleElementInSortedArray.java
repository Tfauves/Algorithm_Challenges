package com.company.leetcode;

import java.util.HashMap;
import java.util.Map;

public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int[] input = {3,3,7,7,10,11,11};

        singleNonDuplicate(input);

    }

    public static int singleNonDuplicate(int[] nums) {
        int loneNum = 0;
        Map<Integer, Integer> numMap = new HashMap<>();

        for (Integer num : nums) {
            if (!numMap.containsKey(num)) {
                numMap.put(num, 1);
            } else {
                numMap.put(num, numMap.get(num) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> item : numMap.entrySet()) {
            Integer key = item.getKey();
            Integer value = item.getValue();

            if (value == 1) loneNum = key;
        }


        System.out.println(loneNum);
        return loneNum;
    }
}
