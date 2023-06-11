package com.company.hackerRank.problemsolving;

// TODO: 6/11/2023 failing 1 testcase 
public class DayOfTheProgrammer {

    public static void main(String[] args) {
        int year = 1984;
        String date = dayOfProgrammer(year);
        System.out.println(date);
    }

    public static String dayOfProgrammer(int year) {

        if ((year < 1918 && year % 4 == 0) || (year > 1918 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))) {
            // Leap year in Julian or Gregorian calendar
            return "12.09." + year;
        } else {
            // Non-leap year in both calendars
            return "13.09." + year;
        }
    }


}
