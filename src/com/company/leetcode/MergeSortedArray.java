package com.company.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;

        merge(nums1, m, nums2, n);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> numList = new ArrayList<>();

        int k = 0;
        int j = 0;

        while ( k < m ) {
            numList.add( nums1[k] );
            k++;
        }

        while ( j < n ) {
            numList.add( nums2[j] );
            j++;
        }


        Collections.sort(numList);
        for (int i = 0; i < numList.size(); i++) {
            nums1[i] = numList.get(i);
        }

        System.out.println(numList);

    }
}
