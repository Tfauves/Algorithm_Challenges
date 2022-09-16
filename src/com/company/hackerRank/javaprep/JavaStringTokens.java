package com.company.hackerRank.javaprep;


import java.util.Scanner;

// TODO: 9/13/2022 will not pass testcase 9 
public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String[] strSplit = s.trim().split("['!?,._@ ]+");
      if (s.equals("")) {

          System.out.println(0);
          return;
      }
        System.out.println(strSplit.length);

        for(int i = 0; i < strSplit.length; i++) {
            System.out.println(strSplit[i]);
        }

        scan.close();
    }
}
// He is a very very good boy, isn't he?