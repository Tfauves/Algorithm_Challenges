package com.company.hackerRank.prep;

// TODO: 5/23/2022 passes 2 of 3 tests
public class MinimumSwap2 {
    public static void main(String[] args) {
        int[] test2 = {2, 3, 4, 1, 5};
        int[] test = {4, 3, 1, 2};
        minimumSwaps(test);

    }

    static int minimumSwaps(int[] arr) {
        int swapCounter = 0;
        for (int i = 0; i < arr.length; i ++) {
            for (int j = 0; j < arr.length - i -1; j++) {

                if (arr[j+1] < arr[j]) {
                    int swapNum = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swapNum;
                    swapCounter++;
                }
            }
        }


        System.out.println(swapCounter);
        return swapCounter;


    }
}