package com.company.hackerRank.prep;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
//
//        11 2 4
//        4 5 6
//        10 8 -12
        List<List<Integer>> test = new ArrayList<>();
        List<Integer> cont1 = new ArrayList<>();
        List<Integer> cont2 = new ArrayList<>();
        List<Integer> cont3 = new ArrayList<>();
        cont1.add(11);
        cont1.add(2);
        cont1.add(4);

        cont2.add(4);
        cont2.add(5);
        cont2.add(6);

        cont3.add(10);
        cont3.add(8);
        cont3.add(-12);

        test.add(cont1);
        test.add(cont2);
        test.add(cont3);

        diagonalDifference(test);

    }



    public static int diagonalDifference(List<List<Integer>> arr) {
        int number = 0;
        for (int row = 0; row < arr.size(); row++) {
//            System.out.println(arr.get(row));
            for (int col = 0; col < arr.get(row).size(); col++) {
//                System.out.println(arr.get(row).get(col));
                number = arr.get(row).get(col);
                if (row == 0) {

                }
            }
            System.out.println(arr.get(row));
        }

        return 0;

    }

}
