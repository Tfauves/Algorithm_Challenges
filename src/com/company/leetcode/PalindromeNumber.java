package com.company.leetcode;

public class PalindromeNumber {
    public static void main(String[] args) {

        isPalindrome(-121);
    }

    public static boolean isPalindrome(int x) {
        boolean isPalinNum = false;

        if (x >= 0) {
            int remainder = 0;
            int reversedNum = 0;
            int input = x;

            while (x != 0) {
                remainder = x % 10;
                reversedNum = reversedNum * 10 + remainder;
                x /= 10;
            }

            if (reversedNum == input) {
                isPalinNum = true;
            }
        }
//        System.out.println(reversedNum);
//
//        System.out.println(isPalinNum);
        return isPalinNum;
    }
}
