package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
    public static void main(String[] args) {
        int[] test = {0,1,2,2,3,0,4,2};

        removeElement(test, 2);
    }

    public static int removeElement(int[] nums, int val) {
        List<Integer> numList = new ArrayList<>();
        for (int i : nums) {
            numList.add(i);
        }

        numList.removeIf(num -> num == val);

        System.out.println(numList);
        return numList.get(0);
    }

//    public static int removeElement(int[] nums, int val) {
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == val) {
//                count++;
//            }
//        }
//        System.out.println(nums.length - count);
//        return nums.length - count;
//
//    }
}
//    public int removeElement(int[] nums, int val) {
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == val) {
//                count++;
//            }
//        }
//        nums[0] = nums.length - count;
//        return nums[0];
//
//    }