package com.company.leetcode;

public class BinarySearch704 {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};

        search(nums, 9);
    }

    public static int search(int[] nums, int target) {
        int targetIndex = 0;
        int first = 0;
        int middle = nums.length / 2;
        int last = nums.length -1;



        while (first <= last) {

            if (nums[middle] < target) {
                first = middle + 1;
            } else if (target == nums[middle]) {
                targetIndex = middle;
                break;
            } else {
                last = middle -1;
            }
            middle = (first + last) / 2;

            if (first > last) {
                targetIndex = -1;
            }
        }

//        System.out.println(targetIndex);
        return targetIndex;

        }

}
