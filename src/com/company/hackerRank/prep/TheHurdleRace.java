package com.company.hackerRank.prep;

import java.util.ArrayList;
import java.util.List;

public class TheHurdleRace {
    public static void main(String[] args) {
        List<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(6);
        height.add(100);
        height.add(5);
        height.add(100);

        hurdleRace(53, height);

    }


    public static int hurdleRace(int k, List<Integer> height) {
        // Write your code here
        int doses = 0;
        int maxHurdle = 0;

        for (Integer hurdleHeight : height) {
            if (k < hurdleHeight && hurdleHeight > maxHurdle ) {
                maxHurdle = hurdleHeight;
                doses = maxHurdle - k;
            }

        }

        System.out.println(doses);

        return doses;

    }
}