package com.company.hackerRank.prep;

import java.util.*;

public class SherlockAnagrams {
    public static void main(String[] args) {
        String testString = "abba";

        sherlockAndAnagrams(testString);
    }


    public static int sherlockAndAnagrams(String s) {
        Map<Character, Integer> amountOfLetters =  new HashMap<>();


        for (char letter : s.toCharArray()){
        if (!amountOfLetters.containsKey(letter)) {
            amountOfLetters.put(letter, 1);
        }else {
            amountOfLetters.put(letter, amountOfLetters.get(letter) +1);
        }


        }
        System.out.println(amountOfLetters);


        return 0;
    }
}
