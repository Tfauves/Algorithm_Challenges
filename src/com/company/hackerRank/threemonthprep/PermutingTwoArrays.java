package com.company.hackerRank.threemonthprep;

import java.util.Collections;
import java.util.List;

public class PermutingTwoArrays {

    public static void main(String[] args) {

    }


    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        Collections.sort(A);
        Collections.sort(B, Collections.reverseOrder());

        for (int i = 0; i < A.size(); i++) {

            Integer sumIt = A.get(i) + B.get(i);
            System.out.println(sumIt);
            if (sumIt < k) {
                return "NO";
            }
        }
        return "YES";
    }
}
