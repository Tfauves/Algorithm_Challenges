package com.company.leetcode;

public class BinarySearch {
    public static void main(String[] args) {
        int[] test = {2, 5};
        int target = 5;

        search(test, target);

    }

    public static int search(int[] nums, int target) {
//        Sort the array in ascending order.
//        Set the low index to the first element of the array
//        and the high index to the last element.
//        Set the middle index to the average of the low and high indices.
//        If the element at the middle index is the target element, return the middle index.
//        If the target element is less than the element at the middle index,
//        set the high index to the middle index – 1.
//        If the target element is greater than the element at the middle index,
//        set the low index to the middle index + 1.
//        Repeat steps 3-6 until the element is found
//        or it is clear that the element is not present in the array.
        int left = 0;
        int right = nums.length -1;

        while (left <= right) {

            int mid = left + ((right - left) / 2);
            if (nums[mid] == target) {
                System.out.println(mid);
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(-1);
        return -1;
    }
}
//    int left = 0, right = nums.length - 1;
//
//// Under this condition
//        while (left <= right) {
//                // Get the middle index and the middle value.
//                int mid = left + (right - left) / 2;
//
//                // Case 1, return the middle index.
//                if (nums[mid] == target) {
//                return mid;
//                }
//                // Case 2, discard the smaller half.
//                else if (nums[mid] < target) {
//        left = mid + 1;
//        }
//        // Case 3, discard the larger half.
//        else {
//        right = mid - 1;
//        }
//        }
//
//        // If we finish the search without finding target, return -1.
//        return -1;