package com.company.leetcode;

import java.util.*;

public class SubtractingEqualAmounts {
    public static void main(String[] args) {

        int[] input = {1,5,0,3,5};

        minimumOperations(input);
    }

    public static int minimumOperations(int[] nums) {
        int processCounter = 0;
        List<Integer> numList = new ArrayList<>();
        for (Integer num : nums) {
            if (num > 0) {
                numList.add(num);
            }
        }

        while (!numList.isEmpty()) {

            Collections.sort(numList);
            if (numList.get(0) == 0) {
                numList.remove(numList.get(0));
            } else {
                int x = Collections.min(numList);
                for (int i = 0; i < numList.size(); i++) {
                    int processed = numList.get(i) - x;
                    numList.set(i, processed);
                }
                processCounter++;
            }

        }

        System.out.println(processCounter);
        return processCounter;
    }
}

////// a much better solution found here////////
//    public int minimumOperations(int[] nums) {
//        Set<Integer> s = new HashSet<>();
//        for(int i:nums)
//            if(i!=0)
//                s.add(i);
//        return s.size();
//    }