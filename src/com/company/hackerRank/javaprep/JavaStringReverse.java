package com.company.hackerRank.javaprep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        String test = "madaa";
        boolean flag = true;

        for (int i = 0; i < test.length(); i++) {
//            System.out.println(test.charAt(i));


            if (test.charAt(i) != test.charAt(test.length() -1 -i)) {
                flag = false;
            }
        }

        System.out.println(flag ? "Yes" : "No");





    }

}
