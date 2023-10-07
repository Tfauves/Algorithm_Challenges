package com.company.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {
    public static void main(String[] args) {

        int[] input = {1, 2};
        System.out.println(majorityEle(input));
    }

    public static List<Integer> majorityEle(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        int len = nums.length;
        int thirdOfLen = len / 3;
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!freqMap.containsKey(nums[i])){
                freqMap.put(nums[i], 1);
            } else{
                freqMap.put(nums[i], freqMap.get(nums[i]) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> item : freqMap.entrySet()) {
            int key = item.getKey();
            int value = item.getValue();

            if (value > thirdOfLen) {
                answer.add(key);
            }
        }

        return answer;
    }
}
