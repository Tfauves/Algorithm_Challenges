package com.company.hackerRank.problemsolving;

import java.util.ArrayList;
import java.util.List;

public class BillDivision {
    public static void main(String[] args) {
        //     4 1
        //    3 10 2 9
        //    12
        List<Integer> bill = new ArrayList<>();
        bill.add(3);
        bill.add(10);
        bill.add(2);
        bill.add(9);

        bonAppetit(bill, 1, 7);
    }

    public static void bonAppetit(List<Integer> bill, int indexOfItemNotEaten, int totalAPaid) {
        // iterate bill adding the values at each index
        // subtract the item value @ index itemNotEaten
        // total the cost of remaining items shared and /2
        // check total aginst totalPaid (total - (totalPaid)
        // if total - totalPaid is != 0 print that amt is overcharged else Bon Appetit
        int total = 0;
        int totalCostOfSharedItems = 0;
        int actual = 0;

        for (int i = 0; i < bill.size(); i++) {
            total += bill.get(i);
            totalCostOfSharedItems = total - bill.get(indexOfItemNotEaten);
            totalCostOfSharedItems /= 2;
            actual = Math.abs(totalCostOfSharedItems - totalAPaid);
        }
        if (actual == 0) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(actual);
        }

    }
}
