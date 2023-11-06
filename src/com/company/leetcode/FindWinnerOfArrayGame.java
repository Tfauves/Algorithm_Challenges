package com.company.leetcode;

import java.util.Arrays;

public class FindWinnerOfArrayGame {
    public static void main(String[] args) {
        int[] input = {2,1,3,5,4,6,7};
        int k = 2;
        System.out.println(getWinner(input, k));

    }

    public static int getWinner(int[] arr, int k) {

      int[] shiftedArray = new int[arr.length];

      for (int i = 1; i < arr.length; i++) {
          shiftedArray[i -1] = arr[i];
      }
      shiftedArray[shiftedArray.length -1] = arr[0];

        System.out.println(Arrays.toString(shiftedArray));
        return shiftedArray[0];
    }

}
