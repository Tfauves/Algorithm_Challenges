package com.company.hackerRank.javaprep;
import java.time.LocalDate;

// https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html
// https://docs.oracle.com/javase/8/docs/api/java/time/DayOfWeek.html#getDisplayName-java.time.format.TextStyle-java.util.Locale-
public class JavaDateTime {

    public static void main(String[] args) {

        findDay(8, 5, 15);
    }

    public static String findDay(int month, int day, int year) {

        LocalDate dateTime = LocalDate.of(year, month, day);
        String dayOTheWeek = dateTime.getDayOfWeek().toString();
        System.out.println(dayOTheWeek);

        return dayOTheWeek;


    }


}
