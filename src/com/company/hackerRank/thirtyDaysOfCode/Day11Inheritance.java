package com.company.hackerRank.thirtyDaysOfCode;

public class Day11Inheritance {
    public class StudentClass {
        public static void main(String[] args) {
            int[] testScores = new int[]{100, 100, 100, 100, 100, 100, 100, 100};

            calculate(testScores);
        }


        public static char calculate(int[] testScores) {
            int average = 0;
            char letterGrade = '\0';
            int totalOfScores = 0;
            for (int i = 0; i < testScores.length; i++) {

                totalOfScores += testScores[i];

            }
            average = totalOfScores / testScores.length;
            if ( average >= 90 && average <= 100) {
                letterGrade = 'O';
            }

            if (average >= 80 && average < 90) {
                letterGrade = 'E';
            }

            if (average >= 70 && average < 80) {
                letterGrade = 'A';
            }

            if (average >= 50 && average < 70) {
                letterGrade = 'P';
            }

            if (average >= 40 && average < 55) {
                letterGrade = 'D';
            }

            if (average <= 40) {
                letterGrade = 'T';
            }

            System.out.println(letterGrade);
            return letterGrade;
        }
    }
}
