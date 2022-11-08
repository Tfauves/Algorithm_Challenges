package com.company.hackerRank.problemsolving;

import java.util.ArrayList;
import java.util.List;

public class Anagram {

    public static void main(String[] args) {

        anagram("aaabbb");
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
            return -1;
        }
        int middle = s.length() / 2;
        String sub1 = s.substring(0, middle);
        String sub2 = s.substring(middle);
        System.out.println(sub1);
        System.out.println(sub2);
        List<Character> chList1 = new ArrayList<>();

        for (Character letter : sub1.toCharArray()) {
            chList1.add(letter);
        }
        System.out.println(chList1);

        for (int i = 0; i <= chList1.size() -1; i++) {
            if (!chList1.contains(sub2.charAt(i))) {
                minNumberChange++;
            }

        }
        System.out.println(minNumberChange);
//        System.out.println(chList1.size());


        return minNumberChange;
    }

}
