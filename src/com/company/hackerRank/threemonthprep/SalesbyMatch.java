package com.company.hackerRank.threemonthprep;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesbyMatch {

    public static int sockMerchant(int n, List<Integer> ar) {
        Map<Integer, Integer> sockMap = new HashMap<>();
        int pairCount = 0;
        for (Integer sock : ar) {
            if (!sockMap.containsKey(sock)) {
                sockMap.put(sock, 1);
            } else {
                sockMap.put(sock, sockMap.get(sock) + 1);
            }
        }

        for(Integer pair : sockMap.keySet()) {
            // System.out.println(sockMap.get(pair));
            int pairs = sockMap.get(pair) /2;
            System.out.println(pairs);
            pairCount += pairs;
        }

        System.out.println(sockMap);

        return pairCount;

    }
}
