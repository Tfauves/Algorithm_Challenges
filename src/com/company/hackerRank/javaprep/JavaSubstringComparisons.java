package com.company.hackerRank.javaprep;

import java.util.ArrayList;
import java.util.List;

public class JavaSubstringComparisons {
    public static void main(String[] args) {
        getSmallestAndLargest("welcometojava", 3);

    }


    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        List<String> subArry = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                subArry.add(s.substring(0, k));
            }
        }

        System.out.println(subArry);

        return smallest + "\n" + largest;
    }
}
