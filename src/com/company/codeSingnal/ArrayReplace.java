package com.company.codeSingnal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

public class ArrayReplace {
    public static void main(String[] args) {
        int [] inputArray = {1, 2, 1};
        solution(inputArray, 1, 3);

    }

    public static int[] solution(int[] inputArray, int elemToReplace, int substitutionElem) {
        int [] arr = new int[inputArray.length] ;
        for (int i = 0; i < inputArray.length; i ++) {
            if (inputArray[i] != elemToReplace) {
               arr[i] = inputArray[i];

            } else {
                arr[i] = substitutionElem;
            }
        }

        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
