package com.company.leetcode;

public class fibNumbers {
    public static void main(String[] args) {

        fibNum(3);

    }

    public static int fibNum(int n) {
        int num1 = 0;
        int num2 = 1;
        int counter = 0;
        int fibNums = 0;

        while (counter < n) {
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            counter++;
            if (counter == n) {
                fibNums = num3 - num1;
            }
        }

        System.out.println(fibNums);
        return fibNums;
    }
}
