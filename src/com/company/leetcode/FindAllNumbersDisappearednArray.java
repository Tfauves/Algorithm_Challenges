package com.company.leetcode;

import java.util.*;

public class FindAllNumbersDisappearednArray {
    public static void main(String[] args) {

        int[] input = {4,3,2,7,8,2,3,1};
        findDisappearedNumbers(input);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int item : nums) {
            numSet.add(item);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!numSet.contains(i)) {
                list.add(i);
            }
        }
        System.out.println(list);
        return list;
    }
}
