package com.company.leetcode;

public class ValidMountainArray {
    public static void main(String[] args) {

        int[] input = {0, 3, 2, 1};

        validMountainArray(input);
    }

    public static boolean validMountainArray(int[] arr) {
       int len = arr.length;

       if (len < 3) return false;

       int peakIndex = 0;

       while (peakIndex < len -1 && arr[peakIndex] < arr[peakIndex + 1]) {
           peakIndex++;
       }

       if (peakIndex == 0 || peakIndex == len -1) return false;

       for (int i = 0; i < peakIndex; i++) {
           if (arr[i] >= arr[i + 1]) return false;
       }

       for (int i = peakIndex; i < len -1; i++) {
           if (arr[i] <= arr[i + 1]) return false;
       }

        return true;
    }
}
