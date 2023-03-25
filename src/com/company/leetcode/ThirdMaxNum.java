package com.company.leetcode;

import java.util.*;

public class ThirdMaxNum {
    public static void main(String[] args) {

        int[] input = {3, 2, 1};

        thirdMax(input);
    }

    public static int thirdMax(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        int removeMaxCounter = 0;

        for (Integer num : nums) {
            numSet.add(num);
        }
        List<Integer> numList = new ArrayList<>(numSet);
        Collections.sort(numList);

        if (numList.size() > 2) {
            while (removeMaxCounter < 2) {
                numList.remove(Collections.max(numList));
                removeMaxCounter++;
            }
        }
        System.out.println(Collections.max(numList));
        return Collections.max(numList);
    }
}
