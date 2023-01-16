package com.company.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// TODO: 1/16/2023 needs work 
public class SortingTheSentence {
    public static void main(String[] args) {
        String test = "is2 sentence4 This1 a3";
        sortSentence(test);

    }

    public static String sortSentence(String s) {
//        String noNums = s.replaceAll("[0-9]","");
        List<String> newStr = new ArrayList<String>(List.of(s.split(" ")));

        Collections.sort(newStr);
        System.out.println(newStr);
        return " ";
    }
}
