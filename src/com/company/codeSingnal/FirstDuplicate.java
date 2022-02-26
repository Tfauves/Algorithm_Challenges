package com.company.codeSingnal;

// TODO: 2/26/2022 finish 
public class FirstDuplicate {
    public static void main(String[] args) {
        int[] arr = new int[] {2, 1, 3, 5, 3, 2};

        solution(arr);
    }

    public static int solution(int[] a) {
        int matches = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++)

                if (a[j] == a[i]) {

                    matches = j;


                }


        }





        return -1;

    }



}
