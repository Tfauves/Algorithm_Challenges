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
            int revDay = Math.abs(dayStart);
            int reversed = 0;
//            System.out.println(dayStart);
            for (; revDay > 0; revDay /= 10) {
                int modIt = revDay % 10;
                reversed = reversed * 10 + modIt;
//                System.out.println(reversed);
                int determinNumber = (dayStart - Math.abs(reversed)) / divisor;
                if ( determinNumber % 2 == 0) {
                    beautifulDays++;
                }

            }

            dayStart++;
        }

        System.out.println(beautifulDays);
        return beautifulDays;
    }
}
