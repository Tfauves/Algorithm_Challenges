package com.company.leetcode;

// TODO: 11/6/2023 fails time limit 
public class FindWinnerOfArrayGame {
    public static void main(String[] args) {
        int[] input = {2,1,3,5,4,6,7};
        int k = 2;
        System.out.println(getWinner(input, k));

    }

    public static int getWinner(int[] arr, int k) {
        int winner = arr[0];
        int roundWins = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > winner) {
                winner = arr[i];
                roundWins = 1;
            } else {
                roundWins++;
            }

            if (roundWins == k) return winner;

            int temp = arr[i];

            for (int j = i; j > 1; j--) {
                arr[j] = arr[j -1];
            }

            arr[1] = temp;

        }

        return winner;
    }

}
