package com.company.hackerRank.thirtyDaysOfCode;

public class Day14Scope {
    public static void main(String[] args) {
        int[] elements = new int[]{8, 19, 3, 2, 7};
        computeDifference(elements);
    }


    public static int computeDifference(int[] elements) {
        int maximumDifference =0;
        for (int i = 0; i < elements.length - 1; i++) {
            for (int j = i + 1; j < elements.length; j++) {

                int absDiff = Math.abs(elements[i] - elements[j]);

                if(absDiff > maximumDifference) {
                    maximumDifference = absDiff;

                }
            }
        }
        System.out.println(maximumDifference);
        return maximumDifference;

    }
}
