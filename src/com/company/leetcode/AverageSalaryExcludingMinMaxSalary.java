package com.company.leetcode;

import java.util.Arrays;

public class AverageSalaryExcludingMinMaxSalary {
    public static void main(String[] args) {

        int[] s = {48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};

        average(s);

    }

    public static double average(int[] salary) {
        double averageSalary = 0;
        int i = 1;
        int len = salary.length -1;
        double sum = 0;
        Arrays.sort(salary);
        int[] sals = new int[len -1];

        while ( i < len) {
           sals[i - 1] = salary[i];
            i++;
        }
        for (int j = 0; j < sals.length; j++) {
            sum += sals[j];
        }


        System.out.println(sum);

        System.out.println(Arrays.toString(sals));

        System.out.println(sum / (double) sals.length -1);
        averageSalary = sum / (double) sals.length;

        System.out.println(averageSalary);
        return averageSalary;
    }
}
