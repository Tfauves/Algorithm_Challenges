package com.company.leetcode;

import java.util.HashSet;
import java.util.Set;

public class CheckIfNAndDoubleExist {
    public static void main(String[] args) {
        int [] input = {-2,0,10,-19,4,6,-8};

        checkIfExist(input);

    }

    public static boolean checkIfExist(int [] arr) {
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(2 * num) || (num % 2 == 0 && set.contains(num / 2))) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
