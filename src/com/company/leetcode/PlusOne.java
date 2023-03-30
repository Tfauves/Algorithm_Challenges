package com.company.leetcode;

import com.company.hackerRank.javaprep.BigInt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// TODO: 1/30/2023 long is not large enough for certain test cases needs bigInteger but still cannot get it workiing. 
public class PlusOne {
    public static void main(String[] args) {

        int [] test = {1,2,3};
//9,8,7,6,5,4,3,2,1,0
        plusOne(test);
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n -1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newNumber = new int [n +1];
        newNumber[0] = 1;

        return newNumber;
    }
}
