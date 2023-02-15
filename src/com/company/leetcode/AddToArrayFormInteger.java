package com.company.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// TODO: 2/15/2023 fails cases with large values most cannot parse large values?????
public class AddToArrayFormInteger {
    public static void main(String[] args) {

        int[] input = {9,9,9,9,9,9,9,9,9,9};

        addToArrayForm(input, 1);

    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> output = new ArrayList<>();
        StringBuilder strOfNums = new StringBuilder();
        LinkedList<Long> stack = new LinkedList<Long>();

        for (int number : num) {
            strOfNums.append(String.valueOf(number));
        }
        Long nums = Long.parseLong(String.valueOf(strOfNums));
        nums += k;

        while (nums > 0) {
            stack.push(nums % 10);
            nums /= 10;
        }

        while (!stack.isEmpty()) {
            output.add(Math.toIntExact(stack.pop()));
        }

        return output;
    }
}
