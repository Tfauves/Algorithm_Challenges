package com.company.hackerRank.threemonthprep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// TODO: 10/4/2022 still dont understand
public class MaximumPerimeterTriangle {
// Non-degenerate triangle − it is a triangle that has a positive area.
// The condition for a non-degenerate triangle with sides a, b, c is
// a + b > c   a + c > b   b + c > a
    public static void main(String[] args) {
        List<Integer> test = Arrays.asList(1, 1, 1, 3, 3);
        // 113 expected output
        maximumPerimeterTriangle(test);

    }

    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        List<Integer> lengths = new ArrayList<>();
////        Collections.sort(sticks);
//
//        for (int i = 0; i < sticks.size(); i++) {
//
//            for (int j = 0; j < sticks.size(); j++) {
//                System.out.println(sticks.get(i) + " " + sticks.get(j));
//            }
//
//        }
//
//
//        return lengths;

        List<List<Integer>> nums = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < sticks.size() - 2; i++) {
            for (int j = 0; j < 2; j++) {
                counter++;
                nums.add(Arrays.asList(sticks.get(j), sticks.get(j + 1), sticks.get(j + 2)));
            }
            if (i == 1){
                break;
            }
            System.out.println(nums);
        }
        // System.out.println(nums);
        return lengths;
    }



}
