package com.company.leetcode;

import java.util.*;

// TODO: 7/30/2023 not working 
public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] input1 = {1, 2, 2, 1};
        int[] input2 = {2, 2};

        intersection(input1, input2);

    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        int[] ans = new int[Math.min(nums1.length, nums2.length)];
        int len1 = nums1.length;
        int len2 = nums2.length;
        int idx = 0;

        if (len1 > len2) {
            for (int i = 0; i < len1; i++) {
                for (int j = 0; j < len2; j++) {
                    if (nums1[i] == nums2[j]) {
                        ans[idx] = nums2[j];
                        idx++;
                    }
                }
            }
        } else {
            for (int i = 0; i < len2; i++) {
                for (int j = 0; j < len1; j++) {
                    if (nums2[i] == nums1[j]) {
                        ans[idx] = nums1[j];
                        idx++;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
