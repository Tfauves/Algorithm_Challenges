package com.company.hackerRank.javaprep;
import java.util.Scanner;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if (!scan.hasNext()){
            System.out.println("0");
        } else {

            String s = scan.nextLine();

            String[] strSplit = s.trim().split("['!?,._@ ]+");

            System.out.println(strSplit.length);

            for(int i = 0; i < strSplit.length; i++) {
                System.out.println(strSplit[i]);
            }

            scan.close();
        }
    }

}
// He is a very very good boy, isn't he?

/// first attempt passed all but test case 9 in jackerrank but worked here
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String s = scan.nextLine();
//
//        String[] strSplit = s.trim().split("['!?,._@ ]+");
//        if (s.equals("")) {
//
//            System.out.println(0);
//            return;
//        }
//        System.out.println(strSplit.length);
//
//        for(int i = 0; i < strSplit.length; i++) {
//            System.out.println(strSplit[i]);
//        }
//
//        scan.close();
//    }