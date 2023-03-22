package com.company.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoOutofThree {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2};
        int[] nums2 = {4, 3, 3};
        int[] nums3 = {5};

        twoOutOfThree(nums1, nums2, nums3);
    }

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> map = new HashSet<>();
        Set<Integer> checkedValues =  new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (Integer item : nums1) {
            map.add(item);
        }

        for (Integer item : nums2) {
            if (map.contains(item)) {
                duplicates.add(item);
            } else {
                checkedValues.add(item);
            }

        }

        for (Integer item : nums3) {
            if (map.contains(item) || checkedValues.contains(item)) {
                duplicates.add(item);
            }
        }

        List<Integer> output = new ArrayList<>(duplicates);

        System.out.println(output);
        return output;
    }
}
