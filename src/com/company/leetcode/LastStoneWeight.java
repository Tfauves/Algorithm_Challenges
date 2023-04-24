package com.company.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// TODO: 4/24/2023 fix not passing 
public class LastStoneWeight {
    public static void main(String[] args) {
        int[] input = {3, 7, 2};

        lastStoneWeight(input);

    }

    public static int lastStoneWeight(int[] stones) {

        if (stones.length == 1) {
            return stones[0];
        }

        List<Integer> weightOfStones = new ArrayList<>();

        Arrays.sort(stones);
        for (int i = stones.length -1; i > 0; i -= 2) {
            weightOfStones.add(stones[i] - stones[i -1]);
        }
        System.out.println(weightOfStones);

        Collections.sort(weightOfStones);
        int lastWeight = weightOfStones.get(weightOfStones.size() -1);

        for (int i = 0; i < weightOfStones.size() -1; i++) {
            lastWeight -= weightOfStones.get(i);
        }

        System.out.println(lastWeight);
        return lastWeight;
    }
}
