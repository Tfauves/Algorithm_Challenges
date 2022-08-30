package com.company.hackerRank.javaprep;

import java.math.BigInteger;
import java.util.Scanner;

public class BigInt {

    public class Solution {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scanner = new Scanner(System.in);
            BigInteger bn1 = scanner.nextBigInteger();
            BigInteger bn2 = scanner.nextBigInteger();

            BigInteger sum = bn1.add(bn2);
            BigInteger product = bn1.multiply(bn2);
            System.out.println(sum);
            System.out.println(product);
        }
    }


}
