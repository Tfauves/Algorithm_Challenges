package com.company.leetcode;

import java.util.*;

public class RelativeSortArray {
    public static void main(String[] args) {

        int[] input1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] input2 = {2,1,4,3,9,6};

        relativeSortArray(input1, input2);
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> numList = new ArrayList<>();
        Map<Integer, Integer> arr2Map = new HashMap<>();

        for (int i = 0; i < arr2.length; i++) {
            arr2Map.put(arr2[i], i);
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == arr2[i]) {
                    System.out.println(arr2Map.get(i));
                }
            }
        }

        System.out.println(arr2Map);

        System.out.println(numList);

        return arr1;
    }
}
