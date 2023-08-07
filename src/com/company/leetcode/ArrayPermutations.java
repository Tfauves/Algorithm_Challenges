package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ArrayPermutations {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> permutations = generatePermutations(arr);
        System.out.println(permutations);
    }

    public static List<List<Integer>> generatePermutations(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        generatePermutations(nums.length, nums, result);
        return result;
    }

    private static void generatePermutations(int n, int[] arr, List<List<Integer>> result) {
        if (n == 1) {
            List<Integer> permutation = new ArrayList<>();
            for (int num : arr) {
                permutation.add(num);
            }
            result.add(permutation);
        } else {
            for (int i = 0; i < n - 1; i++) {
                generatePermutations(n - 1, arr, result);

                if (n % 2 == 0) {
                    swap(arr, i, n - 1);
                } else {
                    swap(arr, 0, n - 1);
                }
            }
            generatePermutations(n - 1, arr, result);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
