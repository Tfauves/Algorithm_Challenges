package com.company.hackerRank.threemonthprep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// TODO: 10/4/2022 still dont understand
public class MaximumPerimeterTriangle {

    public static void main(String[] args) {
        List<Integer> test = Arrays.asList(1, 1, 1, 3, 3);
        maximumPerimeterTriangle(test);

    }

    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        List<Integer> lengths = new ArrayList<>();
        Collections.sort(sticks);

        for (int i = 0; i <= sticks.size() -1; i++) {

            System.out.print(sticks.get(i));

        }
        return lengths;

    }


}
