package com.company.codeSingnal;

public class PhoneCall {

    public static void main(String[] args) {


        solution(1,2,1,6);
    }

    static int solution(int min1, int min2_10, int min11, int s) {
        int totalMins = 0;

        if (min1 > s) {
            return totalMins;
        }
        s -= min1;
        totalMins += 1;

        if ( s == 0 ) {
            return totalMins;
        }



        int mins =  min2_10 * 9;
        if (mins > s) {
            totalMins += s/min2_10;
            return totalMins;
        }
        s -= min2_10 * 9;
        int newMins = mins / min2_10;
        totalMins += newMins;

        int lastMins = s / min11;
        totalMins += lastMins;

        // System.out.println(totalMins);
        return totalMins;

    }


}
