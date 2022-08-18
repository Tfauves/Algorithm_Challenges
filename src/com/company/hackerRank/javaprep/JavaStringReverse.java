package com.company.hackerRank.javaprep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        String test = "madaa";
        List palCheck = new ArrayList();
        List revList = new ArrayList();

        for (Character letter : test.toCharArray()) {
            palCheck.add(letter);

        }

        for (int i = palCheck.size() -1; i >= 0; i--) {
            revList.add(palCheck.get(i));
        }
        System.out.println(palCheck);

        System.out.println(revList);

    }

}
