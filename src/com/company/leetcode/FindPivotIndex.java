package com.company.leetcode;
// TODO: 12/18/2022 fails a time complexity case 
import java.util.Arrays;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] test = {-1,-1,-1,-1,-1,-1};

        pivotIndex(test);

    }

    public static int pivotIndex(int[] nums) {

        if (nums.length == 0) {
            System.out.println(-1);
            return -1;
        }

        int last = nums.length -1;
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i -1];

            System.out.println(Arrays.toString(nums));
            last = nums.length -1;
//            System.out.println(last);

            
        }

        if (nums[last] - nums[0] == 0) {
            System.out.println(0);
            return 0;
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[last] - nums[i] == nums[i -1] ) {
                System.out.println(i);

                return i;
            }
        }

        System.out.println("end" + -1);
        return -1;
    }
}
