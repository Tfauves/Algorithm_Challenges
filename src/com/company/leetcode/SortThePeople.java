package com.company.leetcode;

import java.util.*;

public class SortThePeople {
    public static void main(String[] args) {

        String[] testNames = {"Mary","John","Emma"};
        int[] testHeigts = {180,165,170};

        sortPeople(testNames, testHeigts);
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        String[] queriedNames = new String[heights.length];
        Map<Integer, String> heightMap = new HashMap<>();
        List<String> sorted = new ArrayList<>();

        for (int i = 0; i < heights.length; i++) {
            heightMap.put(heights[i], names[i]);
        }

        for (Map.Entry<Integer, String> item : heightMap.entrySet()) {
            Integer height = item.getKey();
            String name = item.getValue();

        }

        System.out.println(sorted);
        System.out.println(heightMap);
        System.out.println(Arrays.toString(queriedNames));
        return queriedNames;
    }
}

