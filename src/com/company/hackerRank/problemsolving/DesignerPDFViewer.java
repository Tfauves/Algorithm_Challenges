package com.company.hackerRank.problemsolving;

import java.util.*;

public class DesignerPDFViewer {
    public static void main(String[] args) {
        List<Integer> h = Arrays.asList(1,3,1,3,1,4,1,3,2,5,5,5,5,1,1,5,5,1,5,2,5,5,5,5,5,5);
        designerPdfViewer(h, "torn");
    }

    public static int designerPdfViewer(List<Integer> h, String word) {
        // letters of the alphabet are indexed starting with 0 and ending 25
        // find the index of each of the letters in the word given
        // the height of each letter is determined by the int in the h list
        // height value = whatever the int value at the index of h that is = to the           index of the letter in the word.
        // return the size of highlighedArea
        // highLightedArea is the max(tallest) h value * len of char array(word)
        int highlightedArea = 0;
        Map<Character, Integer> alphaMap = new HashMap<>();
        List<Character> alpha = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');

        for (int i = 0; i < alpha.size(); i++) {
            alphaMap.put(alpha.get(i), i);
        }
        char [] wordArr = word.toCharArray();
        int height = 0;


        for (int i = 0; i < wordArr.length; i++) {
            int heightFinderIndex = 0;
//            System.out.println(wordArr[i] + "" + i);
            heightFinderIndex = alphaMap.get(wordArr[i]);
//            System.out.println(heightFinderIndex);
            for (int j = 0; j < h.size(); j++) {
                if ( heightFinderIndex == j) {
                    if(h.get(j) > height) {
                        height = h.get(j);
                    }

                }
            }
        }
        highlightedArea = height * wordArr.length;
        System.out.println(highlightedArea);
        return highlightedArea;

    }
}
