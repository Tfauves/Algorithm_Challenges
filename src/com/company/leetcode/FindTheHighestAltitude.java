package com.company.leetcode;

public class FindTheHighestAltitude {
    public static void main(String[] args) {

        int[] input = {-5,1,5,0,-7};

        largestAltitude(input);
    }

    public static int largestAltitude(int[] gain) {
        int highestPoint = 0;
        int point = 0;

        for (int i = 0; i < gain.length; i++) {

            point += gain[i];

            highestPoint = Math.max(highestPoint, point);
        }



        System.out.println(highestPoint);
        return highestPoint;
    }

}
