package com.company.hackerRank.javaprep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaSubstringComparisons {
    public static void main(String[] args) {
        getSmallestAndLargest("welcometojava", 3);

    }


    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        List<String> subs = new ArrayList<>();

        int index = 0;
        while (k < s.length() + 1) {
            subs.add(s.substring(index, k));
            index += 1;
            k += 1;
        }

        Collections.sort(subs);
        smallest = subs.get(0);
        largest = subs.get(subs.size() -1);

//        System.out.println(subs);
//        System.out.println(smallest + "\n" + largest);
        return smallest + "\n" + largest;
    }
}
