package com.company.hackerRank.problemsolving;

import java.util.*;

public class Anagram {

    public static void main(String[] args) {

        anagram("xaxbbbxx");
//        aaabbb ab abc mnop xyyx xaxbbbxx
//        hhpddlnnsjfoyxpciioigvjqzfbpllssuj
    }

    public static int anagram(String s) {
        int minNumberChange = 0;
        int foundCount = 0;
        int middle = s.length() / 2;
        String sub1 = s.substring(0, middle);
        String sub2 = s.substring(middle);
        System.out.println(sub1);
        System.out.println(sub2);
        boolean isFound = false;


        if(sub1.length() == sub2.length()) {
            char [] subArr1 = sub1.toCharArray();
            char [] subArr2 = sub2.toCharArray();
            Arrays.sort(subArr1);
            Arrays.sort(subArr2);
//            System.out.println(subArr1);
//            System.out.println(subArr2);

            for (int i = 0; i < subArr1.length; i++) {
                for (int j = 0; j < subArr2.length; j++) {

                    if (subArr1[i] == subArr2[j]) {
                        if (i > 1 && subArr1[i] == subArr1[i -1]) {
                            foundCount--;
                            break;
                        }
                        foundCount++;
                        break;
                    }
                }
            }

            minNumberChange = Math.abs(foundCount - sub2.length());
        } else {
            minNumberChange = -1;
        }


        System.out.println(minNumberChange);
        return minNumberChange;
    }

}

//    3 1-1 2 0 1
//
//           len = subArr2.length;
//                   for (int i = 0; i < subArr1.length; i++) {
//        for (int j = 0; j < subArr2.length; j++) {
//
//        if (subArr1[i] == subArr2[j]) {
//        len--;
//
//        }

//                    System.out.println(subArr1[i]);
//                    System.out.println(subArr2[j]);

//
//        }
//        }



//            for (int i = 0; i < sub1.length(); i++) {
//                System.out.println(sub1.charAt(i));
//                if (sub2.indexOf(sub1.charAt(i)) == -1) {
//                    minNumberChange++;
//                }
//            }

//            for (int i = 0; i < sub2.length(); i++) {
//                if (sub1.indexOf(sub2.charAt(i)) == -1) {
//                    minNumberChange++;
//                }
//            }

//        } else {
//            minNumberChange = -1;