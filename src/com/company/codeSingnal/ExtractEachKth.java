package com.company.codeSingnal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExtractEachKth {
    public static void main(String[] args) {
        int [] inputArray = {2, 4, 6, 8, 10};

        solution(inputArray, 2);

    }

    public static int[] solution(int[] inputArray, int k) {
        List<Integer> newList = new ArrayList<>();

        for (int num : inputArray) {
            newList.add(num);

        }


        int[] arr = newList.stream().mapToInt(Integer::intValue).toArray();


        System.out.println(Arrays.toString(arr));
        return arr;

    }
}
