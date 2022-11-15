package com.company.hackerRank.javaprep;

import java.util.Arrays;
import java.util.Scanner;

public class JavaSubarray {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int size = scanner.nextInt();
//
//        int[] inputArray = new int[size];
//
//        for (int i = 0; i < size; i++) {
//            inputArray[i] = scanner.nextInt();
//        }

        int[] inputArray = {1, -2, 4, -5, 1};

        findNegatives(inputArray);

    }

    public static void findNegatives(int[] inputArray) {
        // declare and init neg counter
        // find all subarrays
        // sum the elemets of each subarray
        // if the sum is neg increment neg counter
        // print neg counter total
        int negCount = 0;
       for (int i = 0; i < inputArray.length; i++) {
           int sum = inputArray[i];
           if (inputArray[i] < 0) {
               negCount++;
           }

           for (int j = i + 1 ; j < inputArray.length; j++) {
               sum += inputArray[j];
               if (sum < 0) {
                   negCount++;
               }

           }
       }
        System.out.println(negCount);
    }
}
