package com.company.hackerRank.thirtyDaysOfCode;

import java.util.Scanner;

public class Day26NestedLogic {
// If the book is returned on or before the expected return date, no fine will be charged (i.e.:
// If the book is returned after the expected return day but still within the same calendar month and year as the expected return date fine is 15,
// If the book is returned after the expected return month but still within the same calendar year as the expected return date,the fine is 500
// If the book is returned after the calendar year in which it was expected, there is a fixed fine of 10000

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] returnData = new int[3];
        for(int i=0; i<3; i++){
            returnData[i] = scanner.nextInt();
        }

        int[] dueData = new int[3];
        for(int i=0; i<3; i++){
            dueData[i] = scanner.nextInt();
        }

        if(returnData[2] > dueData[2]){
            System.out.println("10000");
        }
        else if(returnData[2] == dueData[2] && returnData[1]> dueData[1]){
            System.out.println(500*(returnData[1]-dueData[1]));
        }
        else if(returnData[2] == dueData[2] && returnData[1] == dueData[1] && returnData[0]> dueData[0]){
            System.out.println(15*(returnData[0]-dueData[0]));
        }
        else{
            System.out.println("0");
        }

        scanner.close();
    }


}
