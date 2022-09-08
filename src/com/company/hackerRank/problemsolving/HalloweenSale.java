package com.company.hackerRank.problemsolving;

public class HalloweenSale {
    public static void main(String[] args) {
        // 20 3 6 85
        howManyGames(20,3, 6, 85);

    }
    public static int howManyGames(int strtPrice, int discount, int minPrice, int budget) {
        int gamesCanBuy = 0;
        // Return the number of games you can buy
        // price of first game - budget games++
        // price - discount < budget games++
        // price >= minPrice

        int price = strtPrice;

        while(budget >= minPrice) {

            if(price <= budget) {
                gamesCanBuy++;
                budget -= price;
                price -= discount;
            }

            if(price <= minPrice) {
                price = minPrice;
            }

            System.out.println(gamesCanBuy);


        }


        return gamesCanBuy;


    }
}
