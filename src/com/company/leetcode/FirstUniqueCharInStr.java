package com.company.leetcode;

import java.util.*;

public class FirstUniqueCharInStr {

    public static void main(String[] args) {
        String input = "loveleetcode";

        firstUniqChar(input);

    }

    public static int firstUniqChar(String s) {

        Map<Character, Integer> myCharMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            if (!myCharMap.containsKey(s.charAt(i))) {
                myCharMap.put(s.charAt(i), 1);
            } else {
                myCharMap.put(s.charAt(i), myCharMap.get(s.charAt(i)) + 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (myCharMap.get(s.charAt(i)) == 1) {
                System.out.println(i);
                return i;
            }
        }
        System.out.println(-1);
        return -1;
    }
}
