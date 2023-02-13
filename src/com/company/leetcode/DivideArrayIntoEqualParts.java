package com.company.leetcode;

import java.util.*;

public class DivideArrayIntoEqualParts {
    public static void main(String[] args) {

        int[] test = {15,1,4,8,12,11,4,10,4,10,10,15,20,7};
        divideArray(test);
    }

    public static boolean divideArray(int[] nums) {
        Set<Integer> setOfNums = new HashSet<>();
        for(int num : nums){
            if(setOfNums.contains(num)){
                setOfNums.remove(num);
            }else{
                setOfNums.add(num);
            }
        }
        return setOfNums.size() == 0;
    }
}


//    int pairCount = 0;
//        Arrays.sort(nums);
//                for (int i = 0; i < nums.length -1; i += 2) {
//        int j = i + 1;
//        if (nums[i] == nums[j]) pairCount++;
//        }
//
//        System.out.println(nums.length);
//        if (pairCount == 1 || pairCount != 0) {
//        System.out.println(false);
//        return false;
//        }
//        if ( nums.length % pairCount == 0) {
//        System.out.println(true);
//        return true;
//        }
//        System.out.println(false);
//        return false;

