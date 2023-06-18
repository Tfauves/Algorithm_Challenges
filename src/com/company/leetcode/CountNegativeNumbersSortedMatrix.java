package com.company.leetcode;

public class CountNegativeNumbersSortedMatrix {
    public static void main(String[] args) {
        int[][] input = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};

        countNegatives(input);

    }

    public static int countNegatives(int[][] grid) {
        int negCount = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] < 0) negCount++;
            }
        }

        System.out.println(negCount);
        return negCount;

    }
}
