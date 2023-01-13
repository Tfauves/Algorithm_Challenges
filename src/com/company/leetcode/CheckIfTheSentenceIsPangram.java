package com.company.leetcode;

import java.util.HashSet;
import java.util.Set;

public class CheckIfTheSentenceIsPangram {
    public static void main(String[] args) {
        String test = "thequickbrownfoxjumpsoverthelazydog";

        checkIfPangram(test);

    }

    public static boolean checkIfPangram(String sentence) {
        int alphaSize = 26;
        Set<Character> charSet = new HashSet<Character>();
        for (Character letter : sentence.toCharArray()) {
            charSet.add(letter);
        }
        return charSet.size() == alphaSize;
    }
}
