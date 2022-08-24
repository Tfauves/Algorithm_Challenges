package com.company.hackerRank.problemsolving;

import java.util.ArrayList;
import java.util.List;

public class AppleAndOrange {

    public static void main(String[] args) {
//        int a = 7;
//        int b = 15;
        List<Integer> apples = new ArrayList<>();
        List<Integer> oranges = new ArrayList<>();
        int t = 3;
        int s = 2;
        int a = 1;
        int b = 5;
        apples.add(-2);
        oranges.add(-1);

        countApplesAndOranges(s, t, a, b, apples, oranges);
    }



    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int appleHitz = 0;
        int orangeHitz = 0;

        for (int i = 0; i < apples.size(); i++) {
            int aSum = a + apples.get(i);
            if (aSum >= s && aSum <= t) {
                appleHitz++;
                System.out.println(appleHitz);
            }

        }

        for (int i = 0; i < oranges.size(); i++) {
            int oSum = b + oranges.get(i);
            if(oSum >= s && oSum <= t) {
                orangeHitz++;
                System.out.println(orangeHitz);
            }
        }

        System.out.println(appleHitz);
        System.out.println(orangeHitz);


    }

}

