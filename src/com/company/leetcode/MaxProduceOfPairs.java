package com.company.leetcode;
import java.util.Arrays;

public class MaxProduceOfPairs {
    public static void main(String[] args) {
        int [] test = {5,6,2,7,4};

        maxProductDifference(test);
    }

    public static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int minNums = nums[0] * nums[1];
        int maxNums = nums[len - 1] * nums[len - 2];

        System.out.println(maxNums - minNums);
        return maxNums - minNums;
    }
}

////  first attempt was failing time complexity for obvious reasons ///////
//    List<Integer> productList = new ArrayList<>();
//    int len = nums.length;
//
//       for (int i = 0; i < len; i++) {
//        for (int j = i + 1; j < len; j++) {
//        productList.add(nums[i] * nums[j]);
//        }
//        }
//
//        int maxProduct = Collections.max(productList) - Collections.min(productList);
//
//        return maxProduct;