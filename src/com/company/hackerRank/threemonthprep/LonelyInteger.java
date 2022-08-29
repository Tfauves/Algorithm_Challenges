package com.company.hackerRank.threemonthprep;

import java.util.*;

public class LonelyInteger {
    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>();
        //4 9 95 93 57 4 57 93 9
        test.add(4);
        test.add(9);
        test.add(95);
        test.add(93);
        test.add(57);
        test.add(4);
        test.add(57);
        test.add(93);
        test.add(9);

        lonelyinteger(test);
    }

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        Map<Integer, Integer> freqMap = new HashMap<>();
        int lonely = 0;


        for (Integer number : a) {
            if(!freqMap.containsKey(number)) {

                freqMap.put(number, 1);

            } else {
                freqMap.put(number, freqMap.get(number) +1);
            }
        }

        for (Integer nums : freqMap.keySet()) {
            if(freqMap.get(nums) == 1){
                lonely = nums;
            }
        }

        System.out.println(lonely);
        // freqMap.get(Collections.min(freqMap.values()))
        return lonely ;




    }
}
