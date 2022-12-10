package com.company.hackerRank.problemsolving;

import java.util.ArrayList;
import java.util.List;

public class IceCreamParlor {
    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);
        test.add(6);

        icecreamParlor(6, test);

    }

    public static List<Integer> icecreamParlor(int moneyTotal, List<Integer> prices) {
        // Write your code here
        List<Integer> priceIndices = new ArrayList<>();
        for (int i = 0; i < prices.size() -1; i++) {
           for (int j = i + 1; j < prices.size(); j++) {
               int total = prices.get(i) + prices.get(j);

               if (total == moneyTotal) {
                   priceIndices.add(i + 1);
                   priceIndices.add(j + 1);
                   System.out.println(priceIndices);
                   return priceIndices;
               }

           }

        }


//        System.out.println(moneyTotal);
//
//        System.out.println(prices);
        System.out.println(priceIndices);
        return priceIndices;

    }
}
