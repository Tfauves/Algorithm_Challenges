package com.company.practice;

import java.util.*;

public class SherlockAnagrams {
    public static void main(String[] args) {
        String testString = "ifailuhkqq";

        sherlockAndAnagrams(testString);
    }


    public static int sherlockAndAnagrams(String s) {
//        Map<Character, Integer> amountOfLetters =  new HashMap<>();
        Stack<Character> letters = new Stack<>();
        for (char letter : s.toCharArray()){
            letters.push(letter);
        }
//        if (!amountOfLetters.containsKey(letter)) {
//            amountOfLetters.put(letter, 1);
//        }else {
//            amountOfLetters.put(letter, amountOfLetters.get(letter) +1);
//        }
//
//        System.out.println(amountOfLetters);
        System.out.println(letters);

        return 0;
    }
}
