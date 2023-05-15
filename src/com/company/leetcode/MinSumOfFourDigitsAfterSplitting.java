package com.company.leetcode;

import java.util.Arrays;

public class MinSumOfFourDigitsAfterSplitting {
    public static void main(String[] args) {

        sumDigit(8239);
    }

    public static int sumDigit(int input) {
        int minSum = 0;
        // new array to hold the indi digits of input
        int[] inputDigits = new int[4];
        int i = 0;

        // separates the input int into digits and adds them to the array
        while (input > 0) {
            int digit = input % 10;
            input = input / 10;
            inputDigits[i] = digit;
            i++;
        }

        Arrays.sort(inputDigits);

        System.out.println(Arrays.toString(inputDigits));

        // the product of the first index and the tens position
        // plus the value from index 2 give the first pair
        int sum1 = inputDigits[0] * 10 + inputDigits[2];
        // second pair is calculated the same way
        int sum2 = inputDigits[1] * 10 + inputDigits[3];

        // the sum of the two low pairs
        minSum = sum1 + sum2;

        System.out.println(minSum);
        return minSum;
    }
}
