package com.company.hackerRank.problemsolving;

import java.util.ArrayList;
import java.util.List;

// TODO: 9/22/2022 not passing all cases 
public class CavityMap {

    public static void main(String[] args) {
        List<String> grid = new ArrayList<>();
//        1112
//        1912
//        1892
//        1234
        grid.add("1912");
        grid.add("1892");
        grid.add("1232");
        grid.add("1112");

        cavityMap(grid);

    }

    public static List<String> cavityMap(List<String> grid) {
        List<String> mutGrid = new ArrayList<>();

        for (int i = 0; i < grid.size(); i++) {
            System.out.println(grid.get(i));
            mutGrid.add(grid.get(i));

        }

        System.out.print(mutGrid);
        return mutGrid;
    }
}
