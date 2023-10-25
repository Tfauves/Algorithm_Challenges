package com.company.leetcode;

import java.util.Arrays;

public class ReverseInt {
    public static void main(String[] args) {
        int input = 123;
        System.out.println(reverseInt(input));

    }
    public static int reverseInt(int x) {
        long reversedValue = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            reversedValue = reversedValue * 10 + digit;
        }

        if (reversedValue >= Integer.MIN_VALUE && reversedValue <= Integer.MAX_VALUE) {
            return (int) reversedValue;
        }

        return 0;
    }
}
