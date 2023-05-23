package com.company.leetcode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] input = {2,2,1,1,1,2,2};

        majorityElement(input);

    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (Integer num : nums) {
            if (!freqMap.containsKey(num)) {
                freqMap.put(num, 1);
            } else {
                freqMap.put(num, freqMap.get(num) +1);
            }
        }

        return Collections.max(freqMap.entrySet(), Map.Entry.comparingByValue()).getKey();

    }
}
