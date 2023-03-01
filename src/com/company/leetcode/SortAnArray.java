package com.company.leetcode;

import java.util.Arrays;

public class SortAnArray {
    public static void main(String[] args) {

        int[] input = {5,2,3,1};

        sortArray(input);
    }

    public static int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length -1);

        System.out.println(Arrays.toString(nums));
        return nums;
    }

    public static void quickSort(int[] array, int lowIndex, int highIndex) {

        if (lowIndex >= highIndex) return;

        int pivot = array[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {

            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(array, leftPointer, rightPointer);

        }
        swap(array, leftPointer, highIndex);

        quickSort(array, lowIndex, leftPointer -1);
        quickSort(array, leftPointer +1, highIndex);
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }
}
