package com.company.leetcode;

import java.util.*;

public class SingeNumberII {
    public static void main(String[] args) {
        int[] input = {2,2,3,2};

        singleNumber(input);

    }

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int minVal = Collections.min(freqMap.values());

        for (int i : nums) {
            if (freqMap.get(i) == 1)
                minVal = i;
        }

            System.out.println(minVal);
            return minVal;
    }
}
