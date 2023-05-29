package com.company.leetcode;

import java.util.Arrays;

public class DuplicateZeros {

    public static void main(String[] args) {
        int[] input = {0,4,1,0,0,8,0,0,3};

        duplicateZeros(input);

    }

    public static void duplicateZeros(int[] arr) {

        for (int i = 0; i < arr.length -1; i++) {
            int len = arr.length -1;

            if (arr[i] == 0) {
                int insertIndex = i + 1;

                while (len >= insertIndex) {
                    arr[len] = arr[len -1];
                    len--;

                }
                i = insertIndex;
            }

        }
        System.out.println(Arrays.toString(arr));

    }

}
