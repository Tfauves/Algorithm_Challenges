package com.company.leetcode;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        int input = 14;

        System.out.println(check(input));
    }

    public static boolean check(int num) {

        for (int i = 1; i <= num / 2; i++) {
            int product = i * i / 2;
            System.out.println(product);
        }

        if (num % 2 == 0) {
            return true;
        }

        return false;

    }

}
