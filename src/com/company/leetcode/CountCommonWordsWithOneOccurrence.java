package com.company.leetcode;

import java.util.HashMap;
import java.util.Map;

public class CountCommonWordsWithOneOccurrence {
    public static void main(String[] args) {
        String[] w1 = {"leetcode","is","amazing","as","is"};
        String[] w2 = {"amazing","leetcode","is"};

        countWords(w1, w2);

    }

    public static int countWords(String[] words1, String[] words2) {
        int output = 0;
        Map<String, Integer> wordMap = new HashMap<>();

        for (String word : words1) {
            for (String wordd : words2) {
                if (word.equals(wordd)) {
                    if (!wordMap.containsKey(word)) {
                        wordMap.put(word, 1);
                    } else {
                        wordMap.put(word, wordMap.get(word) + 1);
                    }
                }
            }
        }

        for (Map.Entry<String, Integer> item : wordMap.entrySet()) {
            int val = item.getValue();
            if (val == 1) output++;
        }

//        System.out.println(wordMap);
//        System.out.println(output);
        return output;
    }
}
