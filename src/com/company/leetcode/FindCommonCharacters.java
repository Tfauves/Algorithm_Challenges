package com.company.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindCommonCharacters {
    public static void main(String[] args) {

        String[] test = {"bella","label","roller"};

        commonChars(test);
    }

    public static List<String> commonChars(String[] words) {
        List<String> commonChars = new ArrayList<>();
        Map<Character, Integer> charMap = new HashMap<>();
        // Init a char freq map for first word
        for (Character letter : words[0].toCharArray()) {
            charMap.put(letter, charMap.getOrDefault(letter, 0) +1);
        }

        // Iterate through the remaining words
        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            Map<Character, Integer> currentWordCharMap = new HashMap<>();

            // Count the char freq for the current word
            for (Character letter : word.toCharArray()) {
                currentWordCharMap.put(letter, currentWordCharMap.getOrDefault(letter, 0) +1);
            }

            List<Character> keysToRemove = new ArrayList<>();

            // Update the char freq map with the min freqs
            for (Character key : charMap.keySet()) {
                if (!currentWordCharMap.containsKey(key)) {
                    keysToRemove.add(key);
                } else {
                    int minFreq = Math.min(charMap.get(key), currentWordCharMap.get(key));
                    charMap.put(key, minFreq);
                }
            }

            // Remove keys that are not present in currentWordCharMap
            for (Character key : keysToRemove) {
                charMap.remove(key);
            }

        }

        // Build the list of common char based on the char freq map
        for (Character key : charMap.keySet()) {
            int frequency = charMap.get(key);
            for (int i = 0; i < frequency; i++) {
                commonChars.add(String.valueOf(key));
            }
        }


        System.out.println(commonChars);
        return commonChars;
    }
}
