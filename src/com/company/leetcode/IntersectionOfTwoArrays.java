package com.company.leetcode;

import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] input1 = {1, 2, 2, 1};
        int[] input2 = {2, 2};

        intersection(input1, input2);

    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        int[] ans = {};
        Set<Integer> intersectionNums = new HashSet<>();
        Map<Integer, Integer> freqMap1 = new HashMap<>();
        Map<Integer, Integer> freqMap2 = new HashMap<>();

        for (Integer item : nums1) {
            if (!freqMap1.containsKey(item)) {
                freqMap1.put(item, 1);
            } else {
                freqMap1.put(item, freqMap1.get(item) + 1);
            }
        }

        for (Integer item : nums2) {
            if (!freqMap2.containsKey(item)) {
                freqMap2.put(item, 1);
            } else {
                freqMap2.put(item, freqMap2.get(item) + 1);
            }
        }

        System.out.println(freqMap1);
        System.out.println(freqMap2);

        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
