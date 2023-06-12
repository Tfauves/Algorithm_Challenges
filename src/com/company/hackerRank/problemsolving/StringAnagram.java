package com.company.hackerRank.problemsolving;

import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringAnagram {
    public static void main(String[] args) {
        List<String> dictionary = Arrays.asList("listen", "silent", "enlist", "inlets", "banana");
        List<String> query = Arrays.asList("silent", "inlets", "banana");

        List<Integer> anagramCounts = AnagramCounter.countAnagrams(dictionary, query);
        System.out.println(anagramCounts);

    }



    public class AnagramCounter {
        public static List<Integer> countAnagrams(List<String> dictionary, List<String> query) {
            List<Integer> result = new ArrayList<>();

            // Build a map to store the frequency of each word in the dictionary
            Map<String, Integer> dictFreq = new HashMap<>();
            for (String word : dictionary) {
                String sortedWord = sortString(word);
                dictFreq.put(sortedWord, dictFreq.getOrDefault(sortedWord, 0) + 1);
            }

            // Iterate over the query words and count the anagrams
            for (String word : query) {
                String sortedWord = sortString(word);
                result.add(dictFreq.getOrDefault(sortedWord, 0));
            }

            return result;
        }

        // Helper function to sort the characters in a word
        private static String sortString(String word) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            return new String(charArray);
        }
    }

}
