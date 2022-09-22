package com.company.hackerRank.problemsolving;
// TODO: 9/22/2022 still working to solve 
import java.util.ArrayList;
import java.util.List;

public class SubArrayDivision {
    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>();
        // 1 2 1 3 2
        // 3 2

//        5 2 2 1 5 3 2
//        9 3
        test.add(5);
        test.add(2);
        test.add(2);
        test.add(1);
        test.add(5);
        test.add(3);
        test.add(2);
        birthday(test,9,3);
    }

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        // the length of the segments equal birth month
        // the sum of the nums on each segment equal birth day
        // a list to hold the list of numbers of ways the bar can meet the critiera
        // return the len of list of lists
        int waysToSplitCount = 0;
        int next = 0;

            if(s.size() == 1 && s.get(0) == d) {
                waysToSplitCount++;
            }
           for (int current = 0; current < s.size() -1; current++){
               next = current + 1;

               int sum = s.get(current) + s.get(next);
               if(sum == d) {
                   waysToSplitCount++;
               }
//               System.out.println(sum);
           }

        System.out.println(waysToSplitCount);
        return waysToSplitCount;

    }



    //////first attempt
    //        List<List<Integer>> arrs = new ArrayList<>();
//        for (int i = 0; i < s.size() -1; i += breakSize) {
//            arrs.add(s.subList(i, breakSize));
//
//        }

//        List<Integer> subArrs = s.subList(0, breakSize);
//        for (int i = 0; i < subArrs.size(); i++) {
//
//            sum += subArrs.get(i);
//
//        }
//        System.out.println(arrs);
//        System.out.println(sum);
//        System.out.println(subArrs);

}
