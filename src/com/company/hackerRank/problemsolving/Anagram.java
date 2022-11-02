package com.company.hackerRank.problemsolving;

public class Anagram {

    public static void main(String[] args) {

    }

    public static int anagram(String s) {
        int minNumberChange = 0;
        int middle = s.length() / 2;
        String sub1 = s.substring(0, middle);
        String sub2 = s.substring(middle, s.length());
        System.out.println(sub1);
        System.out.println(sub2);

        if(sub1.length() == sub2.length()) {

            for (int i = 0; i < sub1.length(); i++) {
                if (sub2.indexOf(sub1.charAt(i)) == -1) {
                    minNumberChange++;
                }

            }

        } else {
            minNumberChange = -1;
        }




        return minNumberChange;
    }
}
