package com.company.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// TODO: 7/10/2023 needs work 
public class MinAbsDiff {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 3, 5};
        List<int[]> pairs = minimumAbsDifferencePairs(arr);
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }
    }

    public static List<int[]> minimumAbsDifferencePairs(int[] arr) {
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            int diff = Math.abs(arr[i] - arr[i - 1]);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        List<int[]> result = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i] - arr[i - 1]) == minDiff) {
                result.add(new int[]{arr[i - 1], arr[i]});
            }
        }

        return result;
    }
}

