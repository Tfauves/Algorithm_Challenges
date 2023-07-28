package com.company.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MinAbsDiff {
    public static void main(String[] args) {
        int[] arr = {4,2,1,3};
       minimumAbsDifference(arr);
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];

            if (diff < minDiff) {

                minDiff = diff;
                result.clear();
            }

            if (diff == minDiff) {

                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i - 1]);
                pair.add(arr[i]);
                result.add(pair);
            }
        }

        System.out.println(result);
        return result;
    }
}

