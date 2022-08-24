package com.company.hackerRank.threemonthprep;

import java.util.List;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        // iterate the list
        // check the sign of each number and add to the approprate var
        // divide by len for decimal??

        int len = arr.size();
        float posNumber = 0;
        float negNumber = 0;
        float zeroNumber = 0;

        for (int i = 0; i < len; i++) {
            // check if neg pos or zero
            if (arr.get(i) > 0) {
                posNumber ++;
            } else if (arr.get(i) < 0) {
                negNumber++;
            } else if (arr.get(i) == 0) {
                zeroNumber++;
            }
        }

        System.out.println(posNumber / len);
        System.out.println(negNumber / len);
        System.out.println(zeroNumber / len);

    }

}

