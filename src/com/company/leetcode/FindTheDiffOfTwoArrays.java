package com.company.leetcode;

import java.util.*;

public class FindTheDiffOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,3};
        int[] nums2 = {1,1,2,2};

        findDifference(nums1, nums2);

    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> numSet1 = new HashSet<>();
        Set<Integer> numSet2 = new HashSet<>();

        for (int number : nums1){
            numSet1.add(number);
        }

        for (int number : nums2){
            numSet2.add(number);
        }

        Set<Integer> set1Copy = new HashSet<>(numSet1);

        numSet1.removeAll(numSet2);
        numSet2.removeAll(set1Copy);

        System.out.println(Arrays.asList(new ArrayList<>(numSet1), new ArrayList<>(numSet2)));
        return Arrays.asList(new ArrayList<>(numSet1), new ArrayList<>(numSet2));
    }

}
