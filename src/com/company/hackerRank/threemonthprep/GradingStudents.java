package com.company.hackerRank.threemonthprep;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // iterate the grades list using for loop.
        // any grade < 40 is failing.
        // if grade - the next multiple of 5 is <= 3 do not round.
        // else round the grade to the next multiple of 5 and put in rounded grade          list.
        // return a list of the rounded grades.
        // https://stackoverflow.com/questions/9303604/                                     rounding-up-a-number-to-nearest-multiple-of-5

        List<Integer> roundedGrades = new ArrayList<>();
        int roundGrade = 0;
        for (Integer grade : grades) {
            if (grade >= 38) {
                roundGrade = (grade + 4) / 5 * 5;
                int difference = Math.abs(grade - roundGrade);
                if (difference < 3) {
                    roundedGrades.add(grade + difference);
                } else {
                    roundedGrades.add(grade);
                }
                // System.out.println("diff " + " " + difference);
            } else {
                roundedGrades.add(grade);
            }

        }

        System.out.println(roundedGrades);
        return roundedGrades;
    }

}

