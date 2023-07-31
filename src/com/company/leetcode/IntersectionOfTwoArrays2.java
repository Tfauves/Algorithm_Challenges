package com.company.leetcode;

import java.util.*;

public class IntersectionOfTwoArrays2 {
    public static void main(String[] args) {

        int[] input1 = {4,9,5};
        int[] input2 = {9,4,9,8,4};

        intersect(input1, input2);

    }

    public static int[] intersect(int[] nums1, int[] nums2) {
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
