package com.company.hackerRank.problemsolving.insertionSort;

import java.util.ArrayList;
import java.util.List;

public class Part1InsertionSort {
    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>();
//        5
//        2 4 6 8 3
        test.add(2);
        test.add(4);
        test.add(6);
        test.add(8);
        test.add(3);

        insertionSort1(5, test);
    }

    public static void insertionSort1(int n, List<Integer> arr) {
        // Store the value of arr[4]
        // Compare this to each element to the left until a smaller value is reached
        // When the next lower indexed value is smaller than , insert the stored value at the current index and print the entire array.
        // Each time your test fails, copy the value at the lower index to the current index and print your array
        // When the next lower indexed value is smaller than , insert the stored value at the current index and print the entire array.


        for (int i = arr.size() -2; i >= 0; i--) {
            int insertValue = arr.get(arr.size() -1);
            int current = arr.get(i);
            int next = arr.get(i - 1);
            System.out.println("insert " + insertValue + " current " + current + " next " + next);

        }

    }

}
