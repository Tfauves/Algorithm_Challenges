package com.company.hackerRank.problemsolving;

import java.util.ArrayList;
import java.util.List;

// TODO: 10/7/2022 passes 1 case but fails time complexity  
public class SaveThePrisoner {
    public static void main(String[] args) {
        solution(5, 2, 2);
    }

    public static int solution(int numChairs, int candyAmt, int startChair) {
        int badSeat = 0;

        while (candyAmt > 0) {
            for (int i = startChair; i < numChairs; i++) {
                if(candyAmt == 0) break;
                candyAmt--;
                badSeat = i;
            }
        }

        System.out.println(badSeat);
        return badSeat;

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