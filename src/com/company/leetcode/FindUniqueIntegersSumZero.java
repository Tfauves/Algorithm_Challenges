package com.company.leetcode;

import java.util.Arrays;

public class FindUniqueIntegersSumZero {
    public static void main(String[] args) {
        int input = 5;

        sumZero(input);

    }

    public static int[] sumZero(int n) {
        int[] output = new int[n];
        int d =-(n/2);
        if (n % 2 != 0)
        {
            for (int i = 0; i < n; i++)
            {
                output[i] = d;
                d += 1;
            }
        }
        else
        {
            for (int i = 0; i < n; i++)
            {
                if ( d == 0)
                    d += 1;

                output[i] = d;
                d += 1;

            }
        }

        System.out.println(Arrays.toString(output));
        return output;
    }
}
