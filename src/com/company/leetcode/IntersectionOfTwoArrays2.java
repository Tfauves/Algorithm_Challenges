package com.company.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// TODO: 7/17/2023 not passing all cases 

public class IntersectionOfTwoArrays2 {
    public static void main(String[] args) {

        int[] input1 = {1, 2, 2, 1};
        int[] input2 = {2};

        intersect(input1, input2);

    }

    public static int[] intersect(int[] nums1, int[] nums2) {

        List<Integer> intersections = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {

            for (int j = 0; j < nums2.length; j++) {
               
                if (nums1[i] == nums2[j]) {
                    intersections.add(nums1[i]);
                    break;
                }
            }
        }

        System.out.println(intersections);

        int[] ans = new int[intersections.size()];

        for (int i = 0; i < intersections.size(); i++) {
            ans[i] = intersections.get(i);
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
