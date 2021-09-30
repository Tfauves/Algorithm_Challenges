package com.company.thirtyDaysOfCode;

public class Day02Operators {

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here
        double tipAmount = meal_cost / 100 * tip_percent;
        double taxAmount = meal_cost / 100 * tax_percent;
        double totalBill = meal_cost + tipAmount + taxAmount;
        System.out.println(Math.round(totalBill));


    }

}

