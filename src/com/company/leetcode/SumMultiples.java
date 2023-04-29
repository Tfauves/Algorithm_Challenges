package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SumMultiples {
    public static void main(String[] args) {

        sumOfMultiples(7);
    }

    public static int sumOfMultiples(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
        return sum;
    }
}
