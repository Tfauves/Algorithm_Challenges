package com.company.hackerRank.javaprep;
import java.util.Scanner;

// https://www.baeldung.com/java-scanner-hasnext-vs-hasnextline
// https://en.wikipedia.org/wiki/End-of-file
public class JavaEndOfFile {
    public class Solution {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

            Scanner scanner = new Scanner(System.in);
            int lines = 1;

            while(scanner.hasNext()) {
                System.out.println(lines++ + " " + scanner.nextLine());
            }
        }

    }
}
