package com.company.leetcode;

import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] input1 = {1, 2, 2, 1};
        int[] input2 = {2, 2};

        intersection(input1, input2);

    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> intersectionNums = new HashSet<>();
        List<Integer> resultList = new ArrayList<>();

        for (int item : nums1) {
            intersectionNums.add(item);
        }

        for (int item : nums2) {
            if (intersectionNums.contains(item)) {
                resultList.add(item);
                intersectionNums.remove(item);
            }
        }

        int[] ans = new int[resultList.size()];

        for (int i = 0; i < resultList.size(); i++) {
            ans[i] = resultList.get(i);
        }

        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
