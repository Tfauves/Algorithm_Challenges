package com.company.hackerRank.thirtyDaysOfCode;

public class Day04ClassInstance {

    public static void main(String[] args) {
        // write your code here

        if (age < 13) {

            System.out.println("You are young");
        }

        if (age > 13 && age < 18) {

            System.out.println("You are a teenager");
        }
        if (age > 18){

            System.out.println("You are old");
        }
    }
    public static int age = 5;
    public static void yearPasses() {

        age = ++age;
        System.out.println(age);
    }

}
