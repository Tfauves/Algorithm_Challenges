package com.company.hackerRank.problemsolving;
import java.util.*;

// TODO: 10/22/2022 can not seem to get factors right 
public class BetweenTwoSets {
    public static void main(String[] args) {
        List<Integer> testA = new ArrayList<>();
        List<Integer> testB = new ArrayList<>();
        testA.add(2);
        testA.add(4);

        testB.add(16);
        testB.add(32);
        testB.add(96);

//        getTotalX(testA, testB);
        findFactors(96);
    }


//    public static int getTotalX(List<Integer> a, List<Integer> b) {
//        // find the int that is to be considered
//        // the int to be considered is a factor of all elements of the 2nd array
//        // the nums in the first array are factors of the num to be considered
//        // these nums are "between the two arrays"
//        // count and return the number of nums "between the two arrays"
//
//        /*
//            delcare a set to hold integers.
//            iterate list a and find all the factorals of element.
//            add each factorial to the set/ hashmap maybe?????.
//            when all elements in a list have been factorialized and added
//            to the set check list b.
//            for each element in list b find all the factorials.
//            add to set.
//            return the amt of elements in set.
//        */
//
//        Map<Integer, Integer> betweeners = new HashMap<>();
//
//
//
//
//    }

  public static Integer findFactors(Integer input) {
          int factors = 0;
          for (int i = 1; i <= input; i++) {
              if (input % i == 0) {
                  System.out.println(i);
              }
          }

        return factors;
  }









//    public static Integer findFactorials(Integer num) {
//        Integer factor = 1;
//
//        for (int i = 1; i < num; i++) {
//            factor = factor * i;
//        }
//
//
//        System.out.println(factor);
//        return factor;
//    }




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




}
