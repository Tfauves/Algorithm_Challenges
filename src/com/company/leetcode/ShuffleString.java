package com.company.leetcode;

import java.util.*;

public class ShuffleString {
    public static void main(String[] args) {
        String testStr = "codeleet";
        int[] test = {4,5,6,7,0,2,1,3};

        restoreString(testStr, test);

    }

    public static String restoreString(String s, int[] indices) {
        char[] inputChar = s.toCharArray();
        StringBuilder restoredString = new StringBuilder();
        Map<Integer, Character> inputCharMap = new HashMap<>();

        for (int i = 0; i < inputChar.length; i++) {
           inputCharMap.put(indices[i], inputChar[i]);
        }

        for (Character chr : inputCharMap.values()) {
            restoredString.append(chr);
        }
        System.out.println(restoredString);
        return restoredString.toString();
    }
}
