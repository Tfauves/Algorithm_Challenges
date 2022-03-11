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

        // Final passing solution
        int absDiff = 0;
        int rightToLeft = 0;
        int leftToRight =0;
        int length = arr.size() -1;

        for (int i = 0; i < arr.size(); i++) {
            leftToRight += arr.get(i).get(i);
            rightToLeft += arr.get(i).get(length --);

        }

        if (rightToLeft <= 0 && leftToRight <= 0) {
            absDiff = leftToRight - rightToLeft;
        } else {
            absDiff = rightToLeft - leftToRight;
        }


        System.out.println(absDiff);
        return Math.abs(absDiff);


    }

}





    //// Nested loop attempt
//        int absDiff = 0;
//        int leftToRight = 0;
//        int rightToLeft = 0;
//        int length = arr.size() -1;
//
//        for (int row = 0; row < arr.size(); row++) {
////            System.out.println(arr.get(row));
//        for (int col = 0; col < arr.get(row).size(); col++) {
////                System.out.println(arr.get(row).get(col));
//        if (row == col) {
//        leftToRight += arr.get(row).get(col);
//
//        }
//
//
//        System.out.println(arr.get(row).get(length));
//        System.out.println(arr.get(col).get(length));
//
//
//        }
////            System.out.println(arr.get(row));
//        }
//        absDiff = leftToRight - rightToLeft;
////        System.out.println(leftToRight);
////        System.out.println(rightToLeft);
////        System.out.println(absDiff);
//
//        return absDiff;





    /// attempt only passes 7 of 11
//
//    int absDiff = 0;
//    int rightToLeft = 0;
//    int leftToRight =0;
//    int length = arr.size() -1;
//
//        for (int i = 0; i < arr.size(); i++) {
//        leftToRight += arr.get(i).get(i);
//        rightToLeft += arr.get(i).get(length --);
//
//        }
//
//        if (rightToLeft < 0 && leftToRight < 0) {
//        absDiff = leftToRight - rightToLeft;
//        } else {
//        absDiff = rightToLeft - leftToRight;
//        }
//
//
//
//        return absDiff;
//
//
//        }


