package com.company.hackerRank.thirtyDaysOfCode;

public class Day19Interfaces {
    public static void main(String[] args) {
        divisorSum(25);

    }

    static int divisorSum(int n) {
        int dSum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i  == 0) {
                dSum += i;
            }
        }
//        System.out.println(dSum);
        return dSum;
    }
}
