package com.company.hackerRank.threemonthprep;
// TODO: 11/1/2022 breaking with the sublist method
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PickingNumbers {
    public static void main(String[] args) {
        List<Integer> test = Arrays.asList(4, 6, 5, 3, 3, 1);

        pickingNumbers(test);

    }

    public static int pickingNumbers(List<Integer> input) {

        int middle = input.size() / 2;
        List<Integer> subsList1 = new ArrayList<>();
        List<Integer> subsList2 = new ArrayList<>();
        boolean isNewSub = false;

        for (int i = 1; i < input.size(); i++) {

            int preElement = input.get(i -1);
//
//            System.out.println("previous " + " " + preElement);
//
//            System.out.println("i " + "" + input.get(i));

            int absDif = Math.abs(input.get(preElement) - input.get(i));
//
//            System.out.println("abs diff " + " " + absDif);
            if (absDif > 1) {
                subsList1.addAll(input.subList(0, i));
                subsList2.addAll(input.subList(i, input.size()));

            }
        }

//        subsList1.addAll(input.subList(0, middle));
//        subsList2.addAll(input.subList(middle, input.size()));




//        System.out.println(subsList1);
//        System.out.println(subsList2);
//
//
//        System.out.println(Integer.max(subsList1.size(), subsList2.size()));
        return Integer.max(subsList1.size(), subsList2.size());
    }
}
