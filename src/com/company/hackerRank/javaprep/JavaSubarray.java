package com.company.hackerRank.javaprep;

import java.util.Arrays;
import java.util.Scanner;

// TODO: 11/15/2022 not passing 
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
           if (inputArray[i] < 0) {
               negCount++;
           }
           for (int j = i ; j < inputArray.length; j++) {
               int sum = inputArray[i] + inputArray[j];
               if (sum < 0) {
                   System.out.println(sum);
                   negCount++;
               }

           }
       }


        System.out.println(negCount);



    }
}
