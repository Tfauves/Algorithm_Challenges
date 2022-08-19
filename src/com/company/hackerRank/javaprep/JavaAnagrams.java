package com.company.hackerRank.javaprep;

import java.util.Locale;

public class JavaAnagrams {
// todo: not passing test case 1
    // https://www.tutorialspoint.com/java/java_string_replacefirst.htm
    // https://www.w3schools.com/java/ref_string_indexof.asp
    public static void main(String[] args) {

        isAnagram("anagramm", "marganaa");

    }

    public static boolean isAnagram(String a, String b) {

        for (int i = b.length() -1; i >= 0; i--) {
            char bLetters = b.toLowerCase().charAt(i);
            a = a.toLowerCase();

//            System.out.println(bLetters);
//            System.out.println(a);

            //An int value, representing the index of the first occurrence of the character in the string,
            // or -1 if it never occurs
            if (a.indexOf(bLetters) == -1) {
                System.out.println("false");
                return false;
            }
        }

        System.out.println("true");
        return true;

    }

}
