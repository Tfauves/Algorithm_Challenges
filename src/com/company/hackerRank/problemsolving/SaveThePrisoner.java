package com.company.hackerRank.problemsolving;

import java.util.ArrayList;
import java.util.List;

// TODO: 5/30/2022 not passing  
public class SaveThePrisoner {
    public static void main(String[] args) {
        solution(5, 2, 2);
    }

    public static int solution(int numChairs, int candyAmt, int startChair) {
        int badSeat = 0;
        List<Integer> seats = new ArrayList<>();
        for (int i = 1; i <= numChairs; i++) {
            seats.add(i);
        }

        while(candyAmt !=0) {

        }
        System.out.println(badSeat);
        System.out.println(seats);
        return 1;

    }

}

/////////////second attempt//////////////////////

//        List<Integer> chairs = new ArrayList<>();
//        for (int i = 1; i <= numChairs; i ++) {
//            chairs.add(i);
//        }
//        int badSeat = (candyAmt - chairs.size()) / startChair;
//
//        if (badSeat % startChair == 0) {
//            System.out.println(badSeat);
//            return badSeat;
//        }
//        int seat = Math.abs(badSeat);
//        int finalSeat = chairs.size() - candyAmt / seat;
//        System.out.println(Math.floor(badSeat));
//        System.out.println(finalSeat);
//        return finalSeat;




///////////first attempt////////////////////////
//        int badSeat = 0;
//        for (int i = startChair; candyAmt != 0; i++, candyAmt--) {
//            if (i == numChairs) {
//                i = 1;
//                continue;
//            }
//            badSeat = i;
//        }
//        System.out.println(badSeat);
//        return badSeat;