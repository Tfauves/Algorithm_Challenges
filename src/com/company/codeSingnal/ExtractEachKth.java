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
        int index = k -1;

        for (int i = 0; i < inputArray.length; i ++) {
            if (i != index) {
                newList.add(inputArray[i]);
                System.out.println(Arrays.toString(inputArray));


            }


        }




        int[] arr = newList.stream().mapToInt(Integer::intValue).toArray();


        System.out.println(Arrays.toString(arr));
        return arr;

    }
}
