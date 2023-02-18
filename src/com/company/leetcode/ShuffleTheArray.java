package com.company.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] input = {2,5,1,3,4,7};
        int n = 3;

        shuffle(input, n);

    }

    public static int[] shuffle(int[] nums, int n) {
        int j = n;
        List<Integer>outputList = new ArrayList<>();

        for (int front = 0; front < n; front++) {
            outputList.add(nums[front]);
            outputList.add(nums[j]);
            j++;
        }
        int[] newArr = new int[outputList.size()];
       for (int i = 0; i < outputList.size(); i++) {
           newArr[i] = outputList.get(i);
       }

        return newArr;
    }
}
