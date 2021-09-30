package com.company.warmUps;

import java.util.HashSet;
import java.util.List;

public class WU01SalesByMatch {

    public static int sockMerchant(int n, List<Integer> ar) {

        int counter = 0;
        HashSet<Integer> temp = new HashSet<>();

        for (int i = 0; i < n ; i ++) {
            if (!temp.contains(ar.get(i))) {
                temp.add(ar.get(i));
            } else {
                temp.remove(ar.get(i));
                counter++;
            }
        }

        return counter;


    }
}
