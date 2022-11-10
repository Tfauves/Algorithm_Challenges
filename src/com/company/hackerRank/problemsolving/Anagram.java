package com.company.hackerRank.problemsolving;

import java.util.*;

public class Anagram {

    public static void main(String[] args) {

        anagram("hhpddlnnsjfoyxpciioigvjqzfbpllssuj");
        //hhpddlnnsjfoyxpciioigvjqzfbpllssuj
        //xtnipeqhxvafqaggqoanvwkmthtfirwhmjrbphlmeluvoa
        //gqdvlchavotcykafyjzbbgmnlajiqlnwctrnvznspiwquxxsiwuldizqkkaawpyyisnftdzklwagv -1

//        aaabbb ab abc mnop xyyx xaxbbbxx
//        3 1-1 2 0 1

//        asdfjoieufoa
//        fdhlvosfpafhalll
//        mvdalvkiopaufl
//        3 5 5

    }

    public static int anagram(String s) {
        int minNumberChange = 0;
        if (s.length() % 2 == 1) {
            System.out.println(-1);
            return -1;
        }
        int middle = s.length() / 2;
        String sub1 = s.substring(0, middle);
        String sub2 = s.substring(middle);
        System.out.println(sub1);
        System.out.println(sub2);
        final int ALPHA = 26;
        int[] freq = new int[ALPHA];
        int[] freq2 = new int[ALPHA];

        for (int i = 0; i < sub1.length(); i++) {
            freq[sub1.charAt(i) - 'a'] ++;
        }

        for (int i = 0; i < sub2.length(); i++) {
            freq2[sub2.charAt(i) - 'a'] ++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > freq2[i]) {
                minNumberChange += Math.abs(freq[i] - freq2[i]);
            }
        }
        System.out.println(minNumberChange);
        return minNumberChange;
    }

}
