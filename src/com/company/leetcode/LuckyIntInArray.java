package com.company.leetcode;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class LuckyIntInArray {
    public static void main(String[] args) {
        int[] input = {1,2,2,3,3,3};
        findLucky(input);

    }

    public static int findLucky(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int maxLuckyVal = -1;

        for (Integer nums : arr) {
            if (!freqMap.containsKey(nums)) {
                freqMap.put(nums, 1);
            } else {
                freqMap.put(nums, freqMap.get(nums) +1);
            }
        }

        for (Map.Entry<Integer, Integer> item : freqMap.entrySet()) {
            int key = item.getKey();
            int val = item.getValue();

            if (key == val && key > maxLuckyVal) {
                maxLuckyVal = key;
            }
        }
        System.out.println(maxLuckyVal);
        return maxLuckyVal;
    }
}
