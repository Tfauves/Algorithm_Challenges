package com.company.codeSingnal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "abacabad";

        solution(s);
    }

    public static char solution(String s) {
        Map<Character, Integer> letters = new HashMap<Character, Integer>();
        char firstNon = '_';
        for (Character letter : s.toCharArray()) {
            if (!letters.containsKey(letter)) {
                letters.put(letter, 1);

            } else {
                letters.put(letter, letters.get(letter) + 1);
            }
        }

        System.out.println(firstNon);
        return firstNon;

    }

}
