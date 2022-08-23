package com.company.hackerRank.threemonthprep;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

// TODO: 8/23/2022 unsolved 

public class TimeConversion {

    public static String timeConversion(String s) {
        return LocalTime.parse("s",  DateTimeFormatter.ofPattern("hh:mm a", Locale.US) )
                .format( DateTimeFormatter.ofPattern("HH:mm") );



    }


}
