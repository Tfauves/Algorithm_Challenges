package com.company.leetcode;

public class SumOfOddLenArrays {
    public static void main(String[] args) {

        int[] input = {1,4,2,5,3};

        sumOddLengthSubarrays(input);
    }

    public static int sumOddLengthSubarrays(int[] arr) {
        int output = 0;
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            int end = i + 1;
            int start = len - i;
            int total = start * end;
            int odd = total / 2;

            if (total % 2 == 1) {
                odd++;

            }
            output += odd * arr[i];


        }


        System.out.println(output);
        return output;
    }
}
