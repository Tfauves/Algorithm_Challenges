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
        int len = words.length;

        for (String word : words) {
            for (Character letter : word.toCharArray()) {
                if (!charMap.containsKey(letter)) {
                    charMap.put(letter, 1);
                } else {
                    charMap.put(letter, charMap.get(letter) + 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> item : charMap.entrySet()) {
            Character key = item.getKey();
            Integer value = item.getValue();

            if (value >= len) {
                commonChars.add(String.valueOf(key));
            }
        }

        System.out.println(commonChars);

        System.out.println(charMap);

        return commonChars;
    }
}
