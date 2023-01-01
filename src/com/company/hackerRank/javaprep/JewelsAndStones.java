package com.company.hackerRank.javaprep;

import java.util.*;

public class JewelsAndStones {
    public static void main(String[] args) {

        numJewelsInStones("aA", "aAAbbbb");
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int output = 0;
        Map<Character, Integer> stoneMap = new HashMap<>();

        for (Character stone : stones.toCharArray()) {
           if(!stoneMap.containsKey(stone)) {
               stoneMap.put(stone, 1);
           } else {
               stoneMap.put(stone, stoneMap.get(stone) +1);
           }
        }

        for (Map.Entry<Character, Integer> mapItem : stoneMap.entrySet()) {
            Character keyStone = mapItem.getKey();
            Integer valStone = mapItem.getValue();
            for (Character jewel : jewels.toCharArray()) {

                if (jewel == keyStone) {
                    output += valStone;
                }

            }
        }

        System.out.println(output);
        return output;
    }
}

///// better solution using a hashset ////////
//    public int numJewelsInStones(String jewels, String stones) {
//        int output = 0;
//        HashSet<Character> jewelsLetters = new HashSet<>(jewels.length());
//
//        for (int i = 0; i < jewels.length(); i++) {
//            jewelsLetters.add(jewels.charAt(i));
//        }
//
//        for (int i = 0; i < stones.length(); i++) {
//            if (jewelsLetters.contains(stones.charAt(i))) {
//                output++;
//            }
//        }
//
//    }