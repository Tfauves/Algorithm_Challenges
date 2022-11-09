package com.company.hackerRank.problemsolving;

import java.util.*;

public class Anagram {

    public static void main(String[] args) {

        anagram("hhpddlnnsjfoyxpciioigvjqzfbpllssuj");
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
        System.out.println(Arrays.toString(freq));
        System.out.println(Arrays.toString(freq2));

        for (int i = 0; i < freq.length; i++) {
            if (freq2[i] == 0 && freq[i] >= 1) {
                minNumberChange += Math.abs(freq[i] - freq2[i]);
            }
//            if (freq[i] >= 1 && freq2[i] == 0) {
//                minNumberChange++;
//            }
//            if (freq2[i] > freq[i]) {
//                minNumberChange = freq2[i] - freq[i];
//            }
        }

        System.out.println(minNumberChange);
//        System.out.println(chList1.size());


        return minNumberChange;
    }

}
