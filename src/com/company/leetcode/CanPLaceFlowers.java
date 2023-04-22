package com.company.leetcode;

// TODO: 4/22/2023 attempted 
public class CanPLaceFlowers {
    public static void main(String[] args) {
        int[] input = {1,0,0,0,0,1};

        canPlaceFlowers(input, 2);

    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int truthCounter = 0;

        for (int i = 0; i < flowerbed.length -1; i++) {
            int mid = i + 1;
            int next = mid + 1;

            if (flowerbed[i] == 0 && flowerbed[mid] == 0 && flowerbed[next] ==0) {
                truthCounter++;
            }
        }

        System.out.println(truthCounter);
        return truthCounter >= n;
    }
}
