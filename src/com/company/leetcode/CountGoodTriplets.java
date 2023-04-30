package com.company.leetcode;

public class CountGoodTriplets {
    public static void main(String[] args) {
        int[] input = {3,0,1,1,9,7};
        int a = 7;
        int b = 2;
        int c = 3;

        countGoodTriplets(input,a, b, c);

    }

    public static int countGoodTriplets(int[] arr, int a, int b, int c) {

        int goodTrips = 0;
        int len = arr.length;;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                for (int k = j + 1; k < len; k++) {
                    int aTest = Math.abs(arr[i] - arr[j]);
                    int bTest = Math.abs(arr[j] - arr[k]);
                    int cTest = Math.abs(arr[i] - arr[k]);

                    if (aTest <= a && bTest <= b && cTest <= c) {
                        goodTrips++;
                    }
                }
            }
        }

        System.out.println(goodTrips);
        return goodTrips;
    }

}
