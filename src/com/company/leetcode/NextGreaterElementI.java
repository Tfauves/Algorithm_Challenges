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
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[i]) {
                    for (int k = 0; k < nums2.length; k++) {
                        if (nums2[k] > nums1[i]) {
                            ans[i] = nums2[k];
                            break;
                        } else {
                            ans[i] = -1;
                            break;
                        }
                    }

                }
            }
        }

        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
