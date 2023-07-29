package com.company.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortIntsByOneBits {
    public static void main(String[] args) {
        int[] input = {0,1,2,3,4,5,6,7,8};

        sortByBits(input);

    }

    public static int[] sortByBits(int[] arr) {
        List<Integer> list = new ArrayList<>();

        // Calculate the number of ones in the binary representation and store in the list
        for (int num : arr) {
            int onesCount = Integer.bitCount(num);
            list.add(onesCount * 10000 + num); // Combine the ones count and number for sorting
        }

        // Sort the list using a custom comparator
        Collections.sort(list, (a, b) -> a - b);

        // Convert the sorted list back to the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i) % 10000;
        }

        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
