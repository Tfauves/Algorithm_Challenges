package com.company.codeSingnal;

public class TennisSet {
    public class tennisSet {
        public static void main(String[] args) {

            solution(7, 6);

        }

        static boolean solution(int s1, int s2) {
            return s1 == 6 && s2 < 5 || s2 == 6 && s1 < 5 || s1 == 7 && s2 > 4 && s2 < 7 || s2 == 7 && s1 > 4 && s1 < 7;

        }
    }
}
