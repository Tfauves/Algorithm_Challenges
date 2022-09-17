package com.company.hackerRank.problemsolving;

import java.util.ArrayList;
import java.util.List;

public class CavityMap {
    public static void main(String[] args) {
//        1112
//        1912
//        1892
//        1234
        List<String> grid = new ArrayList<>();
        grid.add("1112");
        grid.add("1912");
        grid.add("1892");
        grid.add("1234");

        cavityMap(grid);

    }

    public static List<String> cavityMap(List<String> grid) {
        List<String> mutGrid = new ArrayList<>();
        int len = grid.size();


        for (int row = 0; row < len; row++) {
//            System.out.println(grid.get(row));
            for (int col = 0; col < grid.get(row).length(); col++) {
//                System.out.println(grid.get(row).charAt(col));
               if (row > 0 && row < len -1) {
//                   System.out.println(grid.get(row).charAt(col));


               }

            }

            mutGrid.add(grid.get(row));
        }

//        for(String ele : mutGrid) {
//            System.out.println(ele);
//        }

        return mutGrid;

    }

}
