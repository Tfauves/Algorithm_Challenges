package com.company.hackerRank.thirtyDaysOfCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day28RegexPatternsDatabase {

    public class Solution {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            String[] str = new String[N];

            int i = 0;
            Pattern p = Pattern.compile("[a-z]+@gmail.com");
            List<String> arr = new ArrayList();
            Matcher m;
            for(int a0 = 0; a0 < N; a0++)
            {
                String firstName = scanner.next();
                String email = scanner.next();
                m=p.matcher(email);
                if (m.find())
                    arr.add(firstName.toLowerCase());
            }
            Collections.sort(arr);

            for (String s : arr)
            {
                System.out.println(s);

            }
        }
    }

}
