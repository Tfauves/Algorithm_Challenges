package com.company.hackerRank.thirtyDaysOfCode;

import java.util.ArrayList;
import java.util.List;

public class Day07Arrays {

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        for (int i = arr.size() - 1; i >= 0; i--) {

            System.out.println(arr.get(i));

        }

    }
}
