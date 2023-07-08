package com.company.leetcode;

import java.util.*;

public class MergeSimilarItems {
    public static void main(String[] args) {
        int[][] items1 = {{1, 1}, {4, 5}, {3, 8}};
        int[][] items2 = {{3, 1}, {1, 5}};

        mergeSimilarItems(items1, items2);
    }

    public static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> ret = new ArrayList<>();
        Map<Integer, Integer> mergeSimItemMap = new HashMap<>();

        for (int[] item : items1) {
            int value = item[0];
            int weight = item[1];
            mergeSimItemMap.put(value, mergeSimItemMap.getOrDefault(value, 0) + weight);
        }

        for (int[] item : items2) {
            int value = item[0];
            int weight = item[1];
            mergeSimItemMap.put(value, mergeSimItemMap.getOrDefault(value, 0) + weight);
        }

        for (Map.Entry<Integer, Integer> entry : mergeSimItemMap.entrySet()) {
            List<Integer> newList = new ArrayList<>();
            int value = entry.getKey();
            int weight = entry.getValue();
            newList.add(value);
            newList.add(weight);
            ret.add(newList);
        }
        Collections.sort(ret, Comparator.comparingInt(a -> a.get(0)));

        System.out.println(mergeSimItemMap);
        System.out.println(ret);
        return ret;
    }
}
