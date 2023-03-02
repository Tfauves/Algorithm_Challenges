package com.company.leetcode;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements {
    public static void main(String[] args) {
        int[] input = {1,2,3,2};

        sumOfUnique(input);

    }

    public static int sumOfUnique(int[] nums) {
        int sum = 0;
        Map<Integer, Integer> numMap = new HashMap<>();

        for (Integer num : nums) {
            if (!numMap.containsKey(num)) {
                numMap.put(num, 1);
            } else {
                numMap.put(num, numMap.get(num) +1);
            }
        }

        for (Map.Entry<Integer, Integer> item : numMap.entrySet()) {
            Integer key =  item.getKey();
            Integer value = item.getValue();

            if (value == 1) sum += key;
        }

        System.out.println(sum);
        return sum;
    }
}
