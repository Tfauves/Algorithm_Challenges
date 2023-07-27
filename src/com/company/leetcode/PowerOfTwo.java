package com.company.leetcode;

public class PowerOfTwo {

    public static void main(String[] args) {
        int input = 16;

        isPowerOfTwo(input);

    }

    public static boolean isPowerOfTwo(int n) {
// check for positive num
        if (n <= 0) return false;
// convert to binary string
        String binNum = Integer.toBinaryString(n);

        int countOfOnes = 0;
// iterate and count ones
        for (char c : binNum.toCharArray()) {

            if (c == '1') countOfOnes++;

        }

        System.out.println(countOfOnes == 1);
// if count of ones == 1 return true as n is a power of 2
        return countOfOnes == 1;
    }
}
