package com.company.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// TODO: 4/25/2023 second attempt not passing all cases 
public class LastStoneWeight {
    public static void main(String[] args) {
        int[] input = {5, 1, 8, 10, 7};

        lastStoneWeight(input);
    }

    public static int lastStoneWeight(int[] stones) {

        if (stones.length == 1) {
            return stones[0];
        }
        List<Integer> listOfStones = new ArrayList<>();
         for (Integer weights : stones) {
             listOfStones.add(weights);
         }

        List<Integer> weightOfStones = new ArrayList<>();

         Collections.sort(listOfStones);

        for (int i = stones.length -1; i > 0; i -= 2) {
            weightOfStones.add(listOfStones.get(i) - listOfStones.get(i -1));
            listOfStones.remove(i);
            listOfStones.remove(i -1);
            if (listOfStones.size() == 1) {
                weightOfStones.add(listOfStones.get(0));
            }
        }
        System.out.println(weightOfStones);

        Collections.sort(weightOfStones);
        int lastWeight = weightOfStones.get(weightOfStones.size() -1);

        for (int i = 0; i < weightOfStones.size() -1; i++) {
            lastWeight = Math.abs(lastWeight - weightOfStones.get(i));
        }

        System.out.println(lastWeight);
        return lastWeight;
    }
}
