package com.company.hackerRank.problemsolving;

import java.util.ArrayList;
import java.util.List;

public class CavityMap {
    public static void main(String[] args) {
        // 1112
        //1912
        //1892
        //1234
        List<String> test = new ArrayList<>();
        test.add("1112");
        test.add("1912");
        test.add("1892");
        test.add("1234");

        cavityMap(test);
    }
    public static List<String> cavityMap(List<String> grid) {
        // any index touching edge the first and last elements in grid
        // index 0 and index size -1 will be edges

        List<String> mutGrid = new ArrayList<>();
        StringBuilder mutStr = new StringBuilder();
        for(int i = 1; i < grid.size() -1; i++) {
            for (int j = 0; j < grid.size(); j++) {

                if (j > 0 && j < grid.size() -1) {
                    // System.out.println(j);

                    if (grid.get(i).charAt(j) > grid.get(i).charAt(j + 1) && grid.get(i).charAt(j -1) < grid.get(i).charAt(j)) {
                        if(grid.get(i - 1).charAt(j) < grid.get(i).charAt(j) && grid.get(i + 1).charAt(j) < grid.get(i).charAt(j)) {

//                            System.out.print(grid.get(i).charAt(j));
                            // mut element it X
                            System.out.println(grid.get(i));
//                            mutGrid.add(grid.get(i), "X");



                        }
                    }
                    // element is unchanged

                }

                // build mutCavitymap
                mutGrid.add(grid.get(j));

            }

        }
        System.out.println(mutGrid);

        return mutGrid;

    }


}
