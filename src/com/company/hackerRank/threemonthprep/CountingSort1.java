package com.company.hackerRank.threemonthprep;

import java.util.*;

public class CountingSort1 {
    public static void main(String[] args) {
        List<Integer> sample = new ArrayList<>();
        sample.add(1);
        sample.add(1);
        sample.add(3);
        sample.add(2);
        sample.add(1);
        countingSort(sample);
    }

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        // create a counting list that will hold each index of the input arr
        // iterate input arr if the index holds a value increment the value of the same index in the counting list
        // iterate the count list print the value of each non zero valued index
        List<Integer> freqList = new ArrayList<>(Collections.nCopies(100, 0));
//        for (int i = 0; i < 100; i++) {
//            freqList.add(0);
//        }

        for (Integer i : arr) {
            freqList.set(i, freqList.get(i) + 1);
        }
        System.out.println(freqList);
        return freqList;

    }
}

//        List<Integer> freqList = new ArrayList<>(arr.size());
//        for (int i = 0; i < arr.size() -1; i++) {
//            freqList.add(0);
//
//        }
////        System.out.println(freqList);
//        for (int i = 0; i < arr.size(); i++) {
//            int checkValue = arr.get(i);
////            System.out.println(checkValue);
//            for (int j = 0; j < freqList.size(); j++) {
////                System.out.println(j);
//                if (checkValue == j) {
//                   Integer updateElementVal = freqList.get(j);
//                   updateElementVal++;
////                    System.out.println(updateElementVal);
//                    freqList.set(j, updateElementVal);
////                    System.out.println(freqList);
//                    break;
//                }
//
//            }
//        }
//
////        System.out.println(freqList);
//        return freqList;
//
//
//    }