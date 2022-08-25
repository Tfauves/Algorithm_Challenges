package com.company.hackerRank.threemonthprep;

// Parse the first 2 digits to a number.
// If the number is 12, set it to 0.
// If input ends with PM, add 12.
// Rebuild string, replacing first 2 digits with new number, and removing AM/PM.


public class TimeConversion {
    public static void main(String[] args) {

        timeConversion("12:01:00PM");
    }

    public static String timeConversion(String s) {
        int inputToInt = 0;
        for (int i = 0; i < s.length(); i++) {
            inputToInt = Integer.parseInt(s.substring(0, 2));
            if (inputToInt == 12) {
                inputToInt = 0;
            }
            if (s.endsWith("PM")) {
                inputToInt += 12;
            }
        }
//        System.out.println(String.format("%02d", inputToInt) + s.substring(2, 8));
        return String.format("%02d", inputToInt) + s.substring(2, 8);


    }

}
