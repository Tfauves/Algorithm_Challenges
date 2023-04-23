package com.company.leetcode;

public class CanPLaceFlowers {
    public static void main(String[] args) {
        int[] input = {1,0,0,0,0,0,1};

        canPlaceFlowers(input, 2);
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        for(int i = 0; i < flowerbed.length; i++){
            int curr = flowerbed[i];
            int next = -1;
            int prev = -1;

            if(i < flowerbed.length - 1){
                next = flowerbed[i + 1];
            }
            if(i > 0){
                prev = flowerbed[i - 1];
            }
            if(curr == 0){
                //we can try to plant it
                if(prev != 1 && next != 1){
                    //we can plant it here
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }
        return n <= 0;
    }
}
