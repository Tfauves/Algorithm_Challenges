package com.company.codeSingnal;

import java.util.Arrays;

public class sortByHeight {
    public static void main(String[] args) {
        int[] test = {-1, 150, 190, 170, -1, -1, 160, 180};

        solution(test);
    }

    static int[] solution(int[] arr) {

        int marker, i, temp;
        marker = 0;
        i = 1;

        while(marker < arr.length -1) {
            if ( i == arr.length){
                marker++;
                i = marker;
            }
            if (arr[marker] > arr[i]) {
                if (arr[i] < 0) {
                    i++;
                    continue;

                }
                temp = arr[marker];
                arr[marker] = arr[i];
                arr[i] = temp;
            }
            i++;

        }
        System.out.println(Arrays.toString(arr));
        return arr;

    }
}