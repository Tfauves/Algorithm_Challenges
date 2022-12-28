package com.company.leetcode;

public class CountOddIntervalRange {
    public static void main(String[] args) {

        countOdds(8, 10);
    }

    public static int countOdds(int low, int high) {

        int diffBetween = high - low;
        int oddCount = diffBetween / 2;

        if (low % 2 != 0 || high % 2 != 0) oddCount++;

        System.out.println(oddCount);
        return oddCount;
    }
}

/////first attempt did not pass time complexity
//    public static int countOdds(int low, int high) {
//        int oddCount = 0;
//
//        for (int i = low; i <= high; i++) {
//            if (i % 2 != 0) oddCount++;
//        }
//
//        return oddCount;
//
//    }
