package com.company.leetcode;

public class SortingTheSentence {
    public static void main(String[] args) {
        String test = "is2 sentence4 This1 a3";
        sortSentence(test);

    }

    public static String sortSentence(String s) {
        String[] splitInput = s.split(" ");
        int len = splitInput.length;
        String[] output = new String[len];
        StringBuilder strOutput = new StringBuilder();

        for (int i = 0; i < len; i++) {
            int wordLen = splitInput[i].length();
//            System.out.println(wordLen);
            char lastChar = splitInput[i].charAt(wordLen -1);
//            System.out.println(lastChar);
            int numValOfLastChar = Integer.parseInt(String.valueOf(lastChar));
//            System.out.println(numValOfLastCHar);
            output[numValOfLastChar - 1] = splitInput[i].substring(0, wordLen -1);

        }

        for (String word : output) {
            strOutput.append(word).append(" ");
        }


//        System.out.println(strOutput);
        return strOutput.toString().trim();
    }
}
