package com.company.hackerRank.prep;

import java.util.List;

public class WU03JumpingOnClouds {

    public static int jumpingOnClouds(List<Integer> c) {

        int jumps = 0;
        for (int i = 0; i < c.size() -1; i++) {
            if (c.get(i) == 0) i++; {
                jumps++;
                System.out.println(c.get(i));
            }
        }
        return jumps;

    }

}

