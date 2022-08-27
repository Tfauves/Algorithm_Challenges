package com.company.hackerRank.threemonthprep;
// TODO: 8/27/2022 Not solved 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SparseArrays {

    public static void main(String[] args) {
       // aba baba aba xzxb
        List<String> testStrings = new ArrayList<>();
        List<String> testQuery = new ArrayList<>();

        testStrings.add("aba");
        testStrings.add("baba");
        testStrings.add("aba");
        testStrings.add("xzxb");

        testQuery.add("aba");
        testQuery.add("xzxb");
        testQuery.add("ab");

        // expected output 2 1 0

        matchingStrings(testStrings, testQuery);


    }


    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // for each query string determine how many times it occurs in the list of input strings. Return an List of the results
        // iterate query and compare each string to the strings in the list of strings
        // if the string in query is a match to a string in query increment the count
        // when iteration is complete add count to List

        // iterate queries and see if string value is in map
        // if it is then put the number of times it occurs into the freqOfStr list 
        
        List<Integer> freqOfStr = new ArrayList<>();
        Map<String, Integer> freqMap = new HashMap<>();

        for (String str : strings) {
            if(!freqMap.containsKey(str)) {
                freqMap.put(str, 1);

            }else{
                freqMap.put(str,freqMap.get(str) +1);
            }

        }

        System.out.println(freqMap);
        return freqOfStr;

    }
}
