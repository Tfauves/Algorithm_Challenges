package com.company.hackerRank.javaprep;

import java.util.Scanner;

public class JavaLoopsII {

    class Solution{
        public static void main(String []argh){
            Scanner scanner = new Scanner(System.in);
            int query = scanner.nextInt();
            for(int i = 0; i < query; i++){
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int n = scanner.nextInt();

                int temp = a;
                for (int j = 0; j < n; j++) {
                    temp += (Math.pow(2, j)* b);
                    System.out.print(temp + " ");
                }
                System.out.println();
            }
            scanner.close();
        }
    }
}
