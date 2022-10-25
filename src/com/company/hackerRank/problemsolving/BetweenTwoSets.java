package com.company.hackerRank.problemsolving;
import java.util.*;

// TODO: 10/22/2022 passing 4 tests
public class BetweenTwoSets {
    public static void main(String[] args) {
        List<Integer> testA = new ArrayList<>();
        List<Integer> testB = new ArrayList<>();
        testA.add(2);
        testA.add(4);

        testB.add(16);
        testB.add(32);
        testB.add(96);

        getTotalX(testA, testB);
    }


    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // find the factors of each element in list a
        // find the factors of each element in list b
        // every factor num from list b that are the same as factor num in list a betweenNums++;
        int betweenNums = 0;
        Set<Integer> factors = new HashSet<>();


        for (Integer number : b) {
            for (int i = 1; i <= number; i++) {
//                System.out.println(i);
                if (number % i ==0) {
                    factors.add(i);

                }
            }
        }

        for (Integer num : a) {
            for (int i = 1; i <= num; i++) {
                if (i % num == 0 && factors.contains(i)) {
                    betweenNums++;

                }
            }

        }
        System.out.println(factors);
        System.out.println(betweenNums);

        return betweenNums;

    }

}




///////////////// first attempt /////////////
//    public static int getTotalX(List<Integer> a, List<Integer> b) {
//        // find the int that is to be considered
//        // the int to be considered is a factor of all elements of the 2nd array
//        // the nums in the first array are factors of the num to be considered
//        // these nums are "between the two arrays"
//        // count and return the number of nums "between the two arrays"
//        int numsBetween = 0;
//
//        for (int i = 0; i < b.size(); i++) {
//            int divisor = 0;
//
//            for (int j = 0; j < a.size(); j++) {
//                System.out.println(b.get(i));
//                System.out.println(a.get(j));
//            }
//        }
//
//
//
//        return numsBetween;
//    }

/////////////////// second attempt ///////////////////////////////////////
//    Set<Integer> betweeners = new HashSet<>();
//    int numsBetween = 0;
//
//        for (Integer setANums : a) {
//        for (int i = 1; i <= setANums; i ++) {
//            if (setANums % i == 0)
//                System.out.println(setANums);
////                betweeners.add(setANums);
//        }
//    }
//
//        for (Integer setBNums : b) {
//        for (int i = 1; i <= setBNums; i ++) {
//            if (setBNums % i == 0)
//                System.out.println(setBNums);
//            betweeners.add(setBNums);
//        }
//    }
//
//        System.out.println(betweeners);
//        return numsBetween;
//

/////////////////// third attempt///////////////////////////////////////
//
//    public static int getTotalX(List<Integer> a, List<Integer> b) {
//        // find the factors of each element in list a
//        // find the factors of each element in list b
//        // every factor num from list b that is the same as factor num in list a betweenNums++;
//        int betweenNums = 0;
//        Set<Integer> factorsB = new HashSet<>();
//        Set<Integer> factorsA = new HashSet<>();
//
//
//        for (Integer number : b) {
//            for (int i = 2; i <= number; i++) {
//                if (number % i == 0) {
//
//                    factorsB.add(i);
//                }
//
//            }
//
//        }
//        for (Integer nums : a) {
//            for (int i = 2; i <= nums; i++) {
//                if (nums % i == 0) {
//                    factorsA.add(i);
//                }
//            }
//        }
//
//        for (Integer factB : factorsB) {
//            for (Integer factA : factorsA) {
//                if (factA % factB == 0) {
//                    betweenNums++;
//                }
//            }
//        }
//
//
//        System.out.println(factorsB);
//        System.out.println(factorsA);
//        System.out.println(betweenNums);
//
//        return betweenNums;
//    }
//
//
//}
//
//
