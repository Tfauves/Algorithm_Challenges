package com.company.hackerRank.problemsolving;

public class BeautifulDayAtTheMovies {
    public static void main(String[] args) {

        beautifulDays(20, 23, 6);

    }


    public static int beautifulDays(int dayStart, int dayEnd, int divisor) {
        // a beautiful day = the number - the number in reverse and is evenly              divisible by k
        // i is the starting day number
        // j is the ending day number
        // k is the divisor
        // return the number if beautiful days

        // determine the range of numbers between i and j
        // subtratc each number by its reverse
        //  then divide by k
        // if evenly divided beatifuldays++

        int beautifulDays = 0;

        while (dayStart <= dayEnd) {
            int dayToCheck = Math.abs(dayStart);
            int reversedDayToCHeck = 0;
            for (; dayToCheck > 0; dayToCheck /= 10) {
                int modIt = dayToCheck % 10;
                reversedDayToCHeck = reversedDayToCHeck * 10 + modIt;

//                System.out.println(dayToCheck);

            }
            double dayDifference = (double)(dayStart - reversedDayToCHeck) / divisor;
//            System.out.println(dayDifference);
            if (dayDifference % 1 == 0) {
                beautifulDays++;
            }

//            System.out.println(reversedDayToCHeck);


            dayStart++;
        }

//        System.out.println(beautifulDays);
        return beautifulDays;
    }
}
