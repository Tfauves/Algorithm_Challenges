package com.company.codeSingnal;

import java.util.HashMap;
import java.util.Map;


public class PalindromRearrange {
    public static void main(String[] args) {
        String input = "aabb";

        System.out.println(isPalindrome(input));

    }

    public static boolean isPalindrome(String inputString) {
        Map<Character, Integer> freqMap = new HashMap<>();

        for (Character letter : inputString.toCharArray()) {
            freqMap.put(letter, freqMap.getOrDefault(letter, 0) + 1);
        }

        int oddCharCount = 0;

        for (int count : freqMap.values()) {
            if (count % 2 != 0) {
                oddCharCount++;
            }

            if (oddCharCount > 1) {
                return false;
            }
        }
        return true;
    }
}
