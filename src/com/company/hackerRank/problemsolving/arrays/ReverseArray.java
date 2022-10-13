package com.company.hackerRank.problemsolving.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArray {

    public static List<Integer> reverseArray(List<Integer> a) {
        List<Integer> reversed = new ArrayList<>();
        Collections.reverse(a);

        for (Integer num : a) {
            reversed.add(num);
        }



        return reversed;
    }

}
