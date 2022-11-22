package com.company.hackerRank.problemsolving;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyInteger {

    public static int lonelyinteger(List<Integer> a) {
        int lonelyNum = 0;
        Map<Integer, Integer> mapper = new HashMap<>();
        for (Integer nums : a) {
            if (!mapper.containsKey(nums)) {
                mapper.put(nums, 1);
            } else {
                mapper.put(nums, mapper.get(nums) +1);
            }
        }

        for (Map.Entry<Integer, Integer> nums : mapper.entrySet()) {
            Integer keyNum = nums.getKey();
            Integer value = nums.getValue();

            if ( value == 1) {
                lonelyNum = keyNum;
            }

        }
        return lonelyNum;
    }
}
