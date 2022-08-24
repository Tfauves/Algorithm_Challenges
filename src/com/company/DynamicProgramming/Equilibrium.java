package com.company.DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class Equilibrium {
    public static void main(String[] args) {
        int[] test = new int[] {3, 1, 2, 4, 3};

        solution(test);
    }

    static int solution(int[] n) {
        List<Integer> absDiffSums = new ArrayList<>();
        int leftSum = 0;
        int rightSum = 0;
        int absDif = 0;
        int pointPosition = 1;

        for (int current = 0; current < n.length -1; current++, pointPosition++) {

            System.out.println("current" + " " + current);
            System.out.println("position" + " " + pointPosition);
        }

//        System.out.println(Arrays.toString(n));
        return 0;
    }
}
