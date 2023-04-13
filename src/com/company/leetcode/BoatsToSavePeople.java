package com.company.leetcode;

import java.util.Arrays;

public class BoatsToSavePeople {
    public static void main(String[] args) {
        int[] input = {3, 5, 3, 4};

        numRescueBoats(input, 5);

    }

    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int numOfBoats = 0;
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = i + 1; j < people.length; j++) {
                if (people[i] > limit) {
                    break;
                } else {
                    if (people[i] + people[j] <= limit) {
                        numOfBoats++;
                    }
                    break;
                }
            }

        }
        System.out.println(numOfBoats);
        return numOfBoats;
    }
}
