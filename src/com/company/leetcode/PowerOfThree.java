package com.company.leetcode;

public class PowerOfThree {
    public static void main(String[] args) {

        powOfThree(27);
    }

    public static boolean powOfThree(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}
