package com.company.hackerRank.problemsolving;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BigSorting {
    public static void main(String[] args) {
        List<String> test = Arrays.asList("6", "31415926535897932384626433832795", "1", "3", "10", "3", "5");
        bigSort(test);

    }


    public static List<String> bigSort(List<String> unsorted) {
        List<Integer> intNumbers = new ArrayList<>();
        List<String> strNumbers = new ArrayList<>();

        for (String nums : unsorted) {
            intNumbers.add(Integer.valueOf(nums));
        }
        Collections.sort(intNumbers);

        for (Integer nums : intNumbers) {
            strNumbers.add(Integer.toString(nums));
        }

        System.out.println(strNumbers);
        return strNumbers;
    }
}