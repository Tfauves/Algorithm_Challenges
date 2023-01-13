package com.company.leetcode;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] test = {'G', 'o', 'o', 'd', 'b', 'y', 'e'};
        reverseString(test);

    }

    public static void reverseString(char[] s) {
        int len = s.length -1;
        int left = 0;
        int right = len - left;

        while (left < right) {
            swap(s, left, right);
            left++;
            right--;
        }

        System.out.println(Arrays.toString(s));
    }

    private static void swap(char[] arr, int left, int right) {
        char tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }
}
