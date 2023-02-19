package com.company.leetcode;

public class DifferenceBetweenSum {
    public static void main(String[] args) {
        int[] input = {1,15,6,3};

        differenceOfSum(input);

    }

    public static int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        for (int num : nums) {
            elementSum += num;

            int digitize = num;

            while (digitize > 0) {
                digitSum += digitize % 10;
                digitize /= 10;
            }
        }

        System.out.println(digitSum);

        System.out.println(elementSum);

        System.out.println(Math.abs(elementSum - digitSum));
        return Math.abs(elementSum - digitSum);

    }
}
