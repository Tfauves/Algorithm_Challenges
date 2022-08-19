package com.company.hackerRank.javaprep;

import java.util.Scanner;

public class JavaStaticInitBlock {

    static Scanner scanner = new Scanner(System.in);
    static int B = scanner.nextInt();
    static int H = scanner.nextInt();
    static boolean flag;
    static {
        try {
            if ( B > 0 && H > 0) {
                flag = true;
            } else {
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception err) {
            System.out.println(err);
        }
    }

}
