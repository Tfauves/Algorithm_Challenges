package com.company.hackerRank.problemsolving;

// TODO: 10/12/2022 not passing time complexity 
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BigSorting {
    public static void main(String[] args) {
        List<String> test = Arrays.asList("6", "31415926535897932384626433832795", "1", "3", "10", "3", "5");
        bigSorting(test);

    }
    
    
    public static List<String> bigSorting(List<String> unsorted) {
        List<BigInteger> sorted = new ArrayList<>();
        List<String> sortedStrs = new ArrayList<>();

        for (String strNums : unsorted) {

            sorted.add(new BigInteger(strNums));
        }
        Collections.sort(sorted);


        for(BigInteger nums : sorted) {
            sortedStrs.add(nums.toString());
        }

        return sortedStrs;

    }
    
}
///////////////First Attempt/////////////////////
//
//    public static List<String> bigSort(List<String> unsorted) {
//        List<Integer> intNumbers = new ArrayList<>();
//        List<String> strNumbers = new ArrayList<>();
//
//        for (String nums : unsorted) {
//            intNumbers.add(Integer.valueOf(nums));
//        }
//        Collections.sort(intNumbers);
//
//        for (Integer nums : intNumbers) {
//            strNumbers.add(Integer.toString(nums));
//        }
//
//        System.out.println(strNumbers);
//        return strNumbers;
//    }