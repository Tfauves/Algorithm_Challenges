package com.company.leetcode;

import java.util.Arrays;

public class ReplaceWithGreatestElementOnRight {
    public static void main(String[] args) {
        int[] input = {17,18,5,4,6,1};
        replaceElements(input);

    }

    public static int[] replaceElements(int[] arr) {

        int len = arr.length;
        int i = 0;

        for (; i < len -1; i++) {
            int maxEle = 0;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] > maxEle) {
                    maxEle = arr[j];
                }
            }

            arr[i] = maxEle;

        }
        arr[len - 1] = -1;
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
