package com.company.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountTheNumberOfVowlesInString {
    public static void main(String[] args) {
        String[] input = {"hey", "aeo", "mu", "ooo", "artro"};
        int left = 1;
        int right = 4;

        vowelStrings(input, left, right);

    }

    public static int vowelStrings(String[] words, int left, int right) {
        int vowelCounter = 0;
        Set<Character> vowelSet = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        for (int i = left; i <= right; i++) {
            String s = words[i];
            if (vowelSet.contains(s.charAt(0)) && vowelSet.contains(s.charAt(s.length() - 1))) {
                vowelCounter++;

            }

            System.out.println(vowelCounter);

        }
        return vowelCounter;
    }
}

//    public static boolean vowelTester(String input) {
//        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
//        char checkBegin = input.charAt(0);
//        char checkEnd = input.charAt(input.length() -1);
//        boolean bFlag = false;
//        boolean eFlag = false;
//
//        for (char letter : vowels) {
//
//            if (checkBegin == letter) {
//                bFlag = true;
//            }
//            if (checkEnd == letter) {
//                System.out.println(true);
//                eFlag = true;
//            }
//        }
//        if (bFlag && eFlag) {
//            return true;
//        } else {
//            return false;
//        }
//    }
