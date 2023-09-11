package com.company.leetcode;

public class PerfectNumber {
    public static void main(String[] args) {
        int input = 28;

        System.out.println(checkPerfectNumber(input));

    }

    public static boolean checkPerfectNumber(int num) {
        int divisorSum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                divisorSum += i;
            }
        }

        return divisorSum == num;

    }
}
////better solution/////
//class Solution {
//    public boolean checkPerfectNumber(int num) {
//        if (num <= 1) {
//            return false;
//        }
//
//        int divisorSum = 1; // Start with 1 as all numbers are divisible by 1
//
//        int sqrtNum = (int) Math.sqrt(num);
//        for (int i = 2; i <= sqrtNum; i++) {
//            if (num % i == 0) {
//                divisorSum += i;
//                if (i != num / i) {
//                    divisorSum += num / i; // Add the pair's divisor
//                }
//            }
//        }
//
//        return divisorSum == num;
//    }
//}