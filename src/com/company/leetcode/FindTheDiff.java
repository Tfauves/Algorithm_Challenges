package com.company.leetcode;

import java.util.*;

public class FindTheDiff {
    public static void main(String[] args) {

        String s = "a";
        String t = "aa";

        findTheDifference(s, t);
    }

    public static char findTheDifference(String s, String t) {
        Map<Character, Integer> freqMap = new HashMap<>();
        char diffChar = 'x';

        for (int i = 0; i < t.length(); i++) {

            if (!freqMap.containsKey(t.charAt(i))) {
                freqMap.put(t.charAt(i), 1);
            } else {
                freqMap.put(t.charAt(i), freqMap.get(t.charAt(i)) + 1);
            }
        }

        for (Character letter : s.toCharArray()) {
            if (!freqMap.containsKey(letter)) {
                freqMap.put(letter, 1);
            } else {
                freqMap.put(letter, freqMap.get(letter) - 1);
            }
        }

        for (Map.Entry<Character, Integer> item : freqMap.entrySet()) {
            Integer val = item.getValue();
            Character key = item.getKey();
            if (val == 1) diffChar = key;
        }
        System.out.println(diffChar);
        return diffChar;

    }

//    Set<Character> myCharSet = new HashSet<>();
//    char diffChar = 'x';
//
//        for (int i = 0; i < s.length(); i++) {
//        myCharSet.add(s.charAt(i));
//    }
//
//        for (int i = 0; i < t.length(); i++) {
//        if (!myCharSet.contains(t.charAt(i))) diffChar = t.charAt(i);
//    }
//        System.out.println(diffChar);
//        return diffChar;
}
