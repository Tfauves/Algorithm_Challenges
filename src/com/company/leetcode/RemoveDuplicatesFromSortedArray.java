package com.company.leetcode;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] test = {0,0,1,1,1,2,2,3,3,4};

        removeDuplicates(test);

    }

    public static int removeDuplicates(int[] nums) {

        if(nums.length == 0)
            return 0;

        //index that unique characters will be inserted at
        int addIndex = 1;

        for(int i = 0; i < nums.length - 1; i++) {

            //if true, num[i + 1] is a new unique number
            if(nums[i] < nums[i + 1]){
                nums[addIndex] = nums[i + 1];
                addIndex++;
            }
        }
//        System.out.println(Arrays.toString(nums));
//        System.out.println(addIndex);
        return addIndex;
    }
}
