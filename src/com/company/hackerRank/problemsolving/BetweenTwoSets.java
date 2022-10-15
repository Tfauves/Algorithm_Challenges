package com.company.hackerRank.problemsolving;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// TODO: 10/14/2022 having issues working out the nums to be considered 
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
        // find the int that is to be considered
        // the int to be considered is a factor of all elements of the 2nd array
        // the nums in the first array are factors of the num to be considered
        // these nums are "between the two arrays"
        // count and return the number of nums "between the two arrays"

        /*
            delcare a set to hold integers.
            iterate list a and find all the factorals of element.
            add each factorial to the set.
            when all elements in a list have been factorialized and added
            to the set check list b.
            for each element in list b find all the factorials.
            add to set.
            return the amt of elements in set.
        */
        Set<Integer> betweeners = new HashSet<>();
        int numsBetween = 0;
        
        for (Integer setANums : a) {
            int factor = 1;
            for (int i = 1; i <= setANums; i ++) {
                factor *= i;
                betweeners.add(factor);
            }
        }


        System.out.println(betweeners);
        return numsBetween;


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
}
