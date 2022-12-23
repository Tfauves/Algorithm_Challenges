package com.company.leetcode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int[] test = {4,1,2,1,2};

        singleNumber(test);

    }

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> numFreq = new HashMap<>();

        int signleNum = 0;
        for (int num : nums) {
            if (!numFreq.containsKey(num)) {
                numFreq.put(num, 1);
            } else {
                numFreq.put(num, numFreq.get(num) + 1);
            }
        }
        System.out.println(numFreq);

        for (Map.Entry<Integer, Integer> num : numFreq.entrySet()) {
            int key = num.getKey();
            int val = num.getValue();

            if (val == 1) {
                signleNum = key;
            }
        }

        System.out.println(signleNum);
        return signleNum;
    }
}
