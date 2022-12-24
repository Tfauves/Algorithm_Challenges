package com.company.leetcode;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {

    }

    public static String longestCommonPrefix(String[] strs) {
        String output = "";

        int strLen = strs.length;

        // if size is 0 return empty string
        if (strLen == 0) return output;

        if (strLen == 1) {
            output = strs[0];
        }

        // sort the array of strings
        Arrays.sort(strs);
        // find the minimum length from the fist and last string
        int end = Math.min(strs[0].length(), strs[strLen -1].length());

        int i = 0;
        // find the common prefix between the first and last string
        while( i < end && strs[0].charAt(i) == strs[strLen -1].charAt(i)) {
            i++;
        }
        output = strs[0].substring(0, i);

        return output;
    }
}
