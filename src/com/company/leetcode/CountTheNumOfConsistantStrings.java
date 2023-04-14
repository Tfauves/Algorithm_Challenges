package com.company.leetcode;

import java.util.HashMap;

public class CountTheNumOfConsistantStrings {
    public static void main(String[] args) {
        String inputAllowed = "ab";

        String[] inputWords = {"ad","bd","aaab","baa","badab"};

        countConsistentStrings(inputAllowed, inputWords);

    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;

        for (String word : words) {
            if (mappingIt(word, allowed))
                count++;
        }
        System.out.println(count);
        return count;
    }

    public static boolean mappingIt(String inputA,String inputB){
        HashMap<Character,Integer> myHashMap = new HashMap();

        for(char letter : inputA.toCharArray()){
            myHashMap.put(letter, myHashMap.getOrDefault(letter,0)+1);
        }

        int sum = 0;

        for(char letter : inputB.toCharArray())
        {
            if(myHashMap.containsKey(letter))
            {
                sum += myHashMap.get(letter);
            }
        }

        System.out.println(sum == inputA.length());
        return sum == inputA.length();

    }


}
