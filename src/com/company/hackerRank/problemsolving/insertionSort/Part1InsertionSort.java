package com.company.hackerRank.problemsolving.insertionSort;

import java.util.ArrayList;
import java.util.List;

// TODO: 11/20/2022 works right but dosent pass becaue of print format probs 
public class Part1InsertionSort {
    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>();
//        5
//        2 4 6 8 3
        test.add(1);
        test.add(2);
        test.add(4);
        test.add(5);
        test.add(3);

        insertionSort1(5, test);
    }

    public static void insertionSort1(int n, List<Integer> arr) {
        // Store the value of arr[4]
        // Compare this to each element to the left until a smaller value is reached
        // When the next lower indexed value is smaller than , insert the stored value at the current index and print the entire array.
        // Each time your test fails, copy the value at the lower index to the current index and print your array
        // When the next lower indexed value is smaller than , insert the stored value at the current index and print the entire array.
        int temp = arr.get(arr.size() -1);
//        System.out.println(temp);
        for (int i = arr.size() -1; i >= 0; i--) {
            int next = i -1;

            if (arr.get(next) > arr.get(i)) {
              arr.set(i, arr.get(next));

            }
            if (arr.get(i) > arr.get(next) && arr.get(next) > temp) {
                arr.set(i, arr.get(next));
            }

            if (arr.get(next) < temp ) {
                arr.set(i, temp);
                System.out.println(arr);
                break;
            }

            System.out.println(arr);
        }


    }

}
