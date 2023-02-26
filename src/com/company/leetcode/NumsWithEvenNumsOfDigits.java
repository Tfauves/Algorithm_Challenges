package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

public class NumsWithEvenNumsOfDigits {
    public static void main(String[] args) {
        int[] input = {555, 901, 482, 1771};

        findNumbers(input);
    }

    public static int findNumbers(int[] nums) {
///// my solution
        int output = 0;
        for (Integer num : nums) {
            int digiCounter = 0;
            while (num > 0) {
                int digit = num % 10;
                num /= 10;
                digiCounter++;
            }
            if (digiCounter % 2 == 0) output++;
        }
        System.out.println(output);
        return output;

    }
}
/// better solution
//        int ans = 0;
//        for (int num : nums)
//        {
//            if (Integer.toString(num).length() % 2 == 0){
//                ans++;
//            }
//        }
//        return ans;
//    }