package com.company.leetcode;

import java.util.Arrays;

public class SignOftheProductOfArray {
    public static void main(String[] args) {

        int[] input = {41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};

        arraySign(input);
    }

    public static int arraySign(int[] nums) {
        int product = 1;

        for (int i : nums) {
            if (i < 0) {
                product *= -1;
            } else if (i > 0) {
                product *= 1;
            } else {
                return 0;
            }
        }
        return product;
    }

}
