package com.company.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        int [] test = {1,2,3,1};
        containsNearbyDuplicate(test, 3);

    }

   public static boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean isDup = false;
        Map<Integer, Integer> indices = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer lastIndex = indices.put(nums[i], i);
            if (lastIndex != null && (i - lastIndex) <= k) {
                isDup = true;
            }

        }
       System.out.println(isDup);
        return isDup;
    }

}

//// first attempt passed most test cases but failed time complexity////
//    public static boolean containsNearbyDuplicate(int[] nums, int k) {
//        boolean isDup = false;
//        for (int i = 0; i < nums.length -1; i ++) {
//            for (int j = i +1; j < nums.length; j++) {
//                if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
//                    isDup = true;
//
//                }
//            }
//        }
//
//        return isDup;
//
//    }
