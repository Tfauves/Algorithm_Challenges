package com.company.codeSingnal;

public class AdjacentElementsProduct {
    public static void main(String[] args) {
//        int[] inputArray = new int[] {3, 6, -2, -5, 7, 3};

        int[] inputArray = new int[] {-23, 4, -3, 8, -12};
        solution(inputArray);

    }

    static int solution(int[] inputArray) {
        int product = -100;

        for (int i = 0; i < inputArray.length; i++) {
            int firstNumb = inputArray[i];


            if (i == inputArray.length - 1) {

                break;
            }
            int secNumb = inputArray[i + 1];
            int pro = firstNumb * secNumb;
            if (pro > product) {
                product = pro;
            }





        }
        System.out.println(product);
        return product;
    }
}