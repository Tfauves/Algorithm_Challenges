package com.company.codeSingnal;

public class arrayMaximalDiff {
    public static void main(String[] args) {
        int[] test = {2, 4, 1, 0};

        solution(test);
    }


    static int solution(int[] inputArray) {
        int maxDiff = 0;

        for (int i = 1; i < inputArray.length; i++) {
            int diff = inputArray[i] - inputArray[i -1];
            int absDiff = Math.abs(diff);

            if (absDiff > maxDiff) {
                maxDiff = absDiff;
            }

        }
        System.out.println(Math.abs(maxDiff));
        return Math.abs(maxDiff);

    }



}