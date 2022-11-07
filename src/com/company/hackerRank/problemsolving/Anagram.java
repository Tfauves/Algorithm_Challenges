package com.company.hackerRank.problemsolving;

public class Anagram {

    public static void main(String[] args) {

        anagram("fdhlvosfpafhalll");
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

        for (int i = 0; i < sub1.length(); i++) {
            System.out.println(sub1.charAt(i));
            if (sub2.indexOf(sub1.charAt(i)) == -1) {
                System.out.println("no");
                minNumberChange++;
            }

        }

        System.out.println(minNumberChange);
        return minNumberChange;
    }

}
