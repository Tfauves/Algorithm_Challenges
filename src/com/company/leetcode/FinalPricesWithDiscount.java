package com.company.leetcode;

import java.util.Arrays;

// TODO: 3/9/2023 not passing all  
public class FinalPricesWithDiscount {
    public static void main(String[] args) {
        int[] input = {8,7,4,2,8,1,7,7,10,1};

        finalPrices(input);

    }

    public static int[] finalPrices(int[] prices) {
        int[] answer = new int[prices.length];
        int len = prices.length;


        for (int i = 0; i < len; i++) {
            int discountPrice = prices[i];
          for (int j = i +1; j < len -1; j++) {
              if (prices[j] <= prices[i]) {
                  discountPrice = prices[i] - prices[j];
                  break;
              }

          }
          answer[i] = discountPrice;

        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
