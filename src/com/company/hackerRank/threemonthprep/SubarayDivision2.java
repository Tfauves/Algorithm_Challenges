package com.company.hackerRank.threemonthprep;

import java.util.List;

public class SubarayDivision2 {


    public static int birthday(List<Integer> s, int d, int m) {
        int waysToDivide = 0;

        for (int i = 0; i <= s.size() -m; i++) {
            int sum  = 0;

            for (int j = 0; j < m; j++) {
                sum += s.get(i + j);
            }

            if (sum == d) {
                waysToDivide++;
            }

        }


        return waysToDivide;
    }
}
