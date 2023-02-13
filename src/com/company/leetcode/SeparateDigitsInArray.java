package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SeparateDigitsInArray {
    public static void main(String[] args) {
        int[] test = {13,25,83,77};

        separateDigits(test);

    }

    public static int[] separateDigits(int[] nums) {
        List<Integer> digi = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            String strNum = String.valueOf(nums[i]);

            int len = strNum.length();

            if (len > 0) {
                for (int j = 0; j < len; j++) {
                    digi.add(Integer.parseInt(String.valueOf(strNum.charAt(j))));

                }
            }

        }
        return digi.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
