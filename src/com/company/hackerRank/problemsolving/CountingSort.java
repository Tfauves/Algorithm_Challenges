package com.company.hackerRank.problemsolving;

import com.sun.jdi.Value;
// TODO: 9/27/2022 passing 2 out of 6 testcases 
import java.util.*;

public class CountingSort {
    public static void main(String[] args) {
        List<Integer> sample = Arrays.asList(63, 25, 73, 1, 98, 73, 56, 84, 86, 57, 16, 83, 8, 25, 81, 56, 9, 53, 98, 67, 99, 12, 83, 89,
                80, 91, 39, 86, 76, 85, 74, 39, 25, 90, 59, 10, 94, 32, 44, 3, 89, 30, 27, 79, 46, 96, 27, 32, 18,
                21, 92, 69, 81, 40, 40, 34, 68, 78, 24, 87, 42, 69, 23, 41, 78, 22, 6, 90, 99, 89, 50, 30, 20, 1, 43,
                3, 70, 95, 33, 46, 44, 9, 69, 48, 33, 60, 65, 16, 82, 67, 61, 32, 21, 79, 75, 75, 13, 87, 70, 33);
//        List<Integer> sample = new ArrayList<>();
//
//        sample.add(1);
//        sample.add(1);
//        sample.add(3);
//        sample.add(2);
//        sample.add(1);
        countingSort(sample);

    }
    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        // create a counting list that will hold each index of the input arr
        // iterate input arr if the index holds a value increment the value of the same index in the counting list
        // iterate the count list print the value of each non zero valued index

        List<Integer> freqList = new ArrayList<>(arr.size());
        for (int i = 0; i < arr.size(); i++) {
            freqList.add(0);

        }
//        System.out.println(freqList);
        for (int i = 0; i < arr.size(); i++) {
            int checkValue = arr.get(i);
//            System.out.println(checkValue);
            for (int j = 0; j < freqList.size(); j++) {
//                System.out.println(j);
                if (checkValue == j) {
                    Integer updateElementVal = freqList.get(j);
                    updateElementVal++;
//                    System.out.println(updateElementVal);
                    freqList.set(j, updateElementVal);
//                    System.out.println(freqList);
                    break;
                }

            }
        }

        System.out.println(freqList);
        return freqList;


    }




/// Hashmap attempt
//    public static List<Integer> countingSort(List<Integer> arr) {
//        // create a freq list of the indices of the input list
//        // increment the indices in the freq list everytime an element appears in that index in the input array
//        // return freq list.
//        Map<Integer, Integer> freqMap = new HashMap<>();
//        List<Integer> freqList = new ArrayList<>();
//
//       for(int i = 0; i < arr.size() -1; i++) {
//
//           if (!freqMap.containsKey(i)) {
//                freqMap.put(i, 0);
//           }
//       }
//        for (Integer index : freqMap.keySet()) {
//            for (Integer integer : arr) {
//                if (Objects.equals(integer, index)) {
//                    freqMap.put(index, freqMap.get(index) + 1);
//                }
//            }
//        }
//
////        Collections.sort(freqList);
////        System.out.println(freqList);
//        System.out.println(freqMap);
//        return freqList;
//    }

}
//    List<Value> list = new ArrayList<Value>(map.values());