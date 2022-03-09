package com.company.hackerRank.prep;

import java.util.*;

public class CountCandles {
    public static void main(String[] args) {
        List<Integer> candles = new ArrayList<>();
        candles.add(82);
        candles.add(49);
        candles.add(82);
        candles.add(82);
        candles.add(41);
        candles.add(82);
        candles.add(15);
        candles.add(63);
        candles.add(38);
        candles.add(25);

        birthdayCakeCandles(candles);
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        Map<Integer, Integer> candleCount = new HashMap<>();

        for (int i = 0; i < candles.size(); i++) {

            if (!candleCount.containsKey(candles.get(i))) {
                candleCount.put(candles.get(i), 1);
            } else {
                candleCount.put(candles.get(i), candleCount.get(candles.get(i)) + 1);
            }


        }
        System.out.println(Collections.max(candleCount.values()));
        return Collections.max(candleCount.values());

    }
}
