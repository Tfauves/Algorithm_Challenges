package com.company.codeSingnal;

public class LateRide {
    public static void main(String[] args) {


        System.out.println(solution(808));
    }

    public static int solution(int n) {
        int hours = n / 60;
        int mins = n % 60;


        System.out.println(hours / 10 + hours % 10 + mins / 10 + mins % 10);

        return 0;
    }
}
