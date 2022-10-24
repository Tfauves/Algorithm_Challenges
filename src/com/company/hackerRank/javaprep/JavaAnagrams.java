package com.company.hackerRank.javaprep;

import java.util.Arrays;
import java.util.Scanner;

// TODO: 10/24/2022 still not passing all cases 
public class JavaAnagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();
//        "anagramm"
//        "marganaa"
        isAnagram(a, b);

    }

    public static boolean isAnagram(String a, String b) {

        if(a.length() != b.length()) return false;

        a = a.toLowerCase();
        b = b.toLowerCase();

        char[] charArrA = a.toCharArray();
        char[] charArrB = b.toCharArray();

        Arrays.sort(charArrA);
        Arrays.sort(charArrB);

        boolean result = Arrays.equals(charArrA, charArrB);

        if (!result) {
            System.out.println("Not Anagrams");
            return false;
        }

        System.out.println("Anagrams");
        return true;
    }

}


///// first attempt/////////
//        for (int i = b.length() -1; i >= 0; i--) {
//            char bLetters = b.toLowerCase().charAt(i);
//            a = a.toLowerCase();
//
////            System.out.println(bLetters);
////            System.out.println(a);
//
//            //An int value, representing the index of the first occurrence of the character in the string,
//            // or -1 if it never occurs
//            if (a.indexOf(bLetters) == -1) {
//                System.out.println("false");
//                return false;
//            }
//        }
//
//        System.out.println("true");
//        return true;