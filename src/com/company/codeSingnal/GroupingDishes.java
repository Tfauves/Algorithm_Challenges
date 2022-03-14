package com.company.codeSingnal;

import java.util.Arrays;

public class GroupingDishes {
    public static void main(String[] args) {
        String[][] dishes = new String[][] {{"Salad", "Tomato", "Cucumber", "Salad", "Sauce"},
                {"Pizza", "Tomato", "Sausage", "Sauce", "Dough"},{"Quesadilla", "Chicken", "Cheese", "Sauce"},
                {"Sandwich", "Salad", "Bread", "Tomato", "Cheese"}};

        solution(dishes);

    }

    static String[][] solution(String[][] dishes) {
        String[][] newDishes = new String[][]{};
        for (String[] dish : dishes) {
            System.out.println(Arrays.toString(dish));
        }

        return newDishes;

    }

}