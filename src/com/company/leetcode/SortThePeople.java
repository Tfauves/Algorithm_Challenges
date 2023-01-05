package com.company.leetcode;

import java.util.*;

public class SortThePeople {
    public static void main(String[] args) {

        String[] testNames = {"Mary","John","Emma"};
        int[] testHeights = {180,165,170};

        sortPeople(testNames, testHeights);
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        String[] queriedNames = new String[heights.length];

        Map<Integer, String> heightMap = new HashMap<>();
        for (int i = 0; i < heights.length; i++) {
            heightMap.put(heights[i], names[i]);
        }

        List<Integer> sorted = new ArrayList<>(heightMap.keySet());
        sorted.sort(Collections.reverseOrder());

        int queriedNamesArrIndex = 0;
        for (int i : sorted) {
            queriedNames[queriedNamesArrIndex] = heightMap.get(i);
            queriedNamesArrIndex++;
        }

//        System.out.println(heightMap);
//        System.out.println(Arrays.toString(queriedNames));
        return queriedNames;
    }
}

