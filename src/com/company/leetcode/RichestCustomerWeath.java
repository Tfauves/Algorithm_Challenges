package com.company.leetcode;

public class RichestCustomerWeath {
    public static void main(String[] args) {
        int[][] input = {{1, 2, 3}, {3, 2, 1}};

        maximumWealth(input);

    }

    public static int maximumWealth(int[][] accounts) {
        int maxSum = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];

            }
            if (sum > maxSum) maxSum = sum;
        }

        System.out.println(maxSum);
        return maxSum;
    }
}
