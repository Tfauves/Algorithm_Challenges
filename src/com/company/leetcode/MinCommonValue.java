package com.company.leetcode;

import java.util.*;

public class MinCommonValue {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4};

        minValue(nums1, nums2);

    }

    public static int minValue(int[] nums1, int[] nums2) {
        List<Integer> numslist = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;

        while (p1 < nums1.length && p2 < nums2.length) {
            if (nums1[p1] == nums2[p2]) {
                numslist.add(nums1[p1]);
                p1++;
                p2++;
            } else if (nums1[p1] < nums2[p2]) {
                p1++;
            } else {
                p2++;
            }
        }

        if (numslist.isEmpty()) return -1;

        System.out.println(Collections.min(numslist));
        return Collections.min(numslist);


    }
}
