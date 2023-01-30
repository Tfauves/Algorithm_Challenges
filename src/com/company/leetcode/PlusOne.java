package com.company.leetcode;

import com.company.hackerRank.javaprep.BigInt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// TODO: 1/30/2023 long is not large enough for certain test cases needs bigInteger but still cannot get it workiing. 
public class PlusOne {
    public static void main(String[] args) {

        int [] test = {9,8,7,6,5,4,3,2,1,0};
//9,8,7,6,5,4,3,2,1,0
        plusOne(test);
    }

    public static int[] plusOne(int[] digits) {
        List<Long> output = new ArrayList<>();
        LinkedList<Long> stack = new LinkedList<Long>();
        long intDigits = 0;


        for (int i = 0; i < digits.length; i++) {
            intDigits = intDigits * 10 + digits[i];
        }


        System.out.println(intDigits);
        intDigits += 1;
        System.out.println(intDigits);
        while (intDigits > 0) {
            System.out.println(stack);
            stack.push(intDigits % 10);
            intDigits /= 10;

        }


        while (!stack.isEmpty()) {
            long ele = 0;
          ele = Math.toIntExact(stack.pop());
            output.add(ele);
        }


        System.out.println(Arrays.toString(output.stream()
                .mapToInt(Long::intValue)
                .toArray()));
        return output.stream()
                .mapToInt(Long::intValue)
                .toArray();
    }
}
