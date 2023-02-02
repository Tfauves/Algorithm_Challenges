package com.company.leetcode;
import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static void main(String[] args) {
        String mag = "aa";
        String note = "aa";
        canConstruct(note, mag);
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> noteLetters = new HashMap<>();

        for (Character letter : ransomNote.toCharArray()) {
            if (!noteLetters.containsKey(letter)) {
                noteLetters.put(letter, 1);
            } else {
                noteLetters.put(letter, noteLetters.get(letter) + 1);
            }
        }

        for (Character letter : magazine.toCharArray()) {
            if (noteLetters.containsKey(letter)) {
                noteLetters.put(letter, noteLetters.get(letter) - 1);
                if (noteLetters.get(letter) == 0) {
                    noteLetters.remove(letter);
                }
            }
        }
        return noteLetters.isEmpty();
    }
}
