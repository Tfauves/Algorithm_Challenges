package com.company.leetcode;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] test = {-1,-1,-1,-1,-1,-1};

        pivotIndex(test);

    }

    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }

       for (int i = 0; i < nums.length; leftSum += nums[i++]) {
           if (leftSum * 2 == totalSum - nums[i]) return i;
       }
        return -1;
    }
}
///// first attempt failed time complexity
//    public int pivotIndex(int[] nums) {
//
//        if (nums.length == 0) {
//            System.out.println(-1);
//            return -1;
//        }
//
//        int last = nums.length -1;
//        for (int i = 1; i < nums.length; i++) {
//            nums[i] += nums[i -1];
//
//            System.out.println(Arrays.toString(nums));
//            last = nums.length -1;
////            System.out.println(last);
//            // if (nums[last] - nums[0] == 0) {
//
//            //     System.out.println(0);
//            //     return 0;
//            // }
//        }
//
//        if (nums[last] - nums[0] == 0) {
//
//            System.out.println(0);
//            return 0;
//        }
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[last] - nums[i] == nums[i -1] ) {
////                System.out.println(i);
//
//                return i;
//            }
//        }
//
////        System.out.println("end" + -1);
//        return -1;
//    }
