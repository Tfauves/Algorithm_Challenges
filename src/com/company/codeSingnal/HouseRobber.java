package com.company.codeSingnal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//attempt3
public class HouseRobber {
    public static void main(String[] args) {
        int[] test = new int[] {1, 1, 1};

        solution(test);

    }

    static int solution(int[] nums) {
        //new array??? or copy
        int maxLoot = 0;
        int prev = 0;
        int next = 0;

        if (nums.length == 1) {
            return nums[0];
        }

        for (int current = 0; current < nums.length -1; current++) {

            next = current + 1;

            if (current > 0) {
                prev = current - 1;
            }

            if (nums[next] >= nums[current]) {

                if (maxLoot != 0) {
                    if (nums[next] + nums[prev] > maxLoot) {
                        maxLoot = nums[next] + nums[prev];
                    }
                }
                maxLoot += nums[next];
            } else {

                maxLoot = nums[current];
            }
        }


        System.out.println(maxLoot);
        return maxLoot;


    }
}


///Attempt 1

//else if (nums[next] + nums[prev] > maxLoot) {
//        maxLoot = nums[next] + nums[prev];
//        }




//        Map<Integer, Integer> houses = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            houses.put(i, nums[i]);
//
//        }
//        int evenPayout = 0;
//        int oddPayout = 0;
//        for (Integer house : houses.keySet()) {
//            if (house % 2 == 0) {
//                evenPayout += houses.get(house);
//            } else if (house % 2 == 1) {
//                oddPayout += houses.get(house);
//            }
//
//
//        }
//
//        if (evenPayout > oddPayout){
//            return evenPayout;
//        }
//        // System.out.print(evenPayout);
//        // System.out.print(oddPayout);
//        // System.out.print(houses);
//
//        return oddPayout;



///Attempt 2
//    int solution(int[] nums) {
//        int maxLoot = 0;
//        int prev = 0;
//        int next = 0;
//
//        if (nums.length == 1) {
//            return nums[0];
//        }
//        for (int current = 0; current < nums.length -1; current++) {
//
//
//            next = current + 1;
//
//            if (current > 0) {
//                prev = current - 1;
//            }
//
//            if (nums[next] > nums[current]) {
//
//                if (maxLoot != 0) {
//                    if (nums[next] + nums[prev] > maxLoot) {
//                        maxLoot = nums[next] + nums[prev];
//                    } else {
//                        continue;
//                    }
//                }
//                maxLoot += nums[next];
//            } else if (nums[next] + nums[prev] > maxLoot) {
//                maxLoot = nums[next] + nums[prev];
//            }
//        }
//
//
//        System.out.println(maxLoot);
//        return maxLoot;
//
//
//
//    }

