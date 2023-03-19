package com.company.leetcode;

import java.util.Arrays;

public class DeleteTheGreatestValueInARow {
    public static void main(String[] args) {
        int[][] input = {{1, 2, 4},{3, 3, 1}};
        deleteGreatestValue(input);

    }

    public static int  deleteGreatestValue(int[][] grid) {
        int total = 0;
        for (int i = 0; i < grid.length; i++) {
            Arrays.sort(grid[i]);
        }

        for (int i = 0; i < grid[0].length; i++) {
            int max = 0;
            for (int j = 0; j < grid.length; j++) {
                max = Math.max(max, grid[j][i]);
            }
            total += max;
        }
        System.out.println(total);
        return total;
    }
}


///// first attempt //////
//Set<Integer> rowTotal = new HashSet<>();
//    int maxSum = 0;
//        System.out.println(Arrays.deepToString(grid));
//                for (int i = 0; i < grid.length; i++) {
//        int rowMax = 0;
//        for (int j = 0; j < grid[i].length; j++) {
//        if (grid[i][j] > rowMax) {
//        rowMax = grid[i][j];
//        }
//
//        }
//        if(rowMax > maxSum) {
//        maxSum = rowMax;
//        }
//        rowTotal.add(maxSum);
//
//        }
//
//        System.out.println(rowTotal);
//        System.out.println(Arrays.deepToString(grid));