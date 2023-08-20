package com.company.leetcode;

public class NumberOfEmployeesThatMetTarget {
    public static void main(String[] args) {
        int[] hours = {0,1,2,3,4};
        int target = 2;
        numberOfEmployeesWhoMetTarget(hours, target);

    }

    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int metTargetCount = 0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target) metTargetCount++;
        }
        System.out.println(metTargetCount);
        return metTargetCount;
    }
}
