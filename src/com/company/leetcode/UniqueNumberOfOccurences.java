package com.company.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurences {

    public static void main(String[] args) {
        int[] input = {1,2,2,1,1,3};

        uniqueOccurrences(input);

    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freqOfNums = new HashMap<>();

        for (int num : arr) {
            if (!freqOfNums.containsKey(num)) {
                freqOfNums.put(num, 1);
            } else {
                freqOfNums.put(num, freqOfNums.get(num) + 1);
            }
        }

        Set<Integer> check = new HashSet<>();
        for (Integer value : freqOfNums.values()) {

            if (check.contains(value)) {
                System.out.println(false);
                return false;
            } else {
                check.add(value);
            }
        }

        System.out.println(freqOfNums);

        System.out.println(true);
        return true;
    }
}
