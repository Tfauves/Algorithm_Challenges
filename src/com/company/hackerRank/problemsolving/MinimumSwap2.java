package com.company.hackerRank.problemsolving;

// TODO: 5/25/2022 passing only 4 out of 15 
public class MinimumSwap2 {
    public static void main(String[] args) {
        int[] test2 = {2, 3, 4, 1, 5};
        int[] test = {4, 3, 1, 2};
        minimumSwaps(test);

    }
    // each index i, check to see if arr[i] == i+1,
    // if not, then use an inner loop to find arr[j] == i+1,
    // then swap and increment there
// Bubble sort
    static int minimumSwaps(int[] arr) {
        int swapCounter = 0;
        for (int i = 0; i < arr.length; i ++) {

            for (int j = 1; j < arr.length -1; j++) {

                if (arr[j] < arr[j - 1]) {
                    int swapNum = arr[j];
                    arr[j] = arr[j -1];
                    arr[j - 1] = swapNum;
                    swapCounter++;
                }
            }
        }

        System.out.println(swapCounter);
        return swapCounter;

    }

    // Insertion sort
//    static int minimumSwaps(int[] arr) {
//        int swapCounter = 0;
//        for (int current = 1; current < arr.length; current ++) {
//            int prev = current -1;
//            int numCompare = arr[current];
//
//            while(prev >= 0 && arr[prev] > numCompare) {
//                arr[prev +1] = arr[prev--];
//                arr[prev +1] = numCompare;
//                swapCounter++;
//            }
//
//        }
//
//
//        System.out.println(swapCounter);
//        return swapCounter;
//
//
//    }

}
