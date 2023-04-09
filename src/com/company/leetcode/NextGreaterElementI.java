package com.company.leetcode;
import java.util.Arrays;


public class NextGreaterElementI {
    public static void main(String[] args) {
        int[] input1 = {4,1,2};
        int[] input2 = {1, 3, 4, 2};

        nextGreaterElement(input1, input2);

    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = checkForTarget(nums1[i], nums2);
        }


        System.out.println(Arrays.toString(ans));
        return ans;
    }

    public static int checkForTarget(int target, int[] nums) {
        int output = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] > target) {
                        output = nums[j];
                        break;
                    } else {
                        output = -1;
                    }
                }
            }
        }

        return output;

    }
}
