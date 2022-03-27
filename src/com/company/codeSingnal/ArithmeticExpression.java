package com.company.codeSingnal;

public class ArithmeticExpression {
    public static void main(String[] args) {
        solution(8, 3, 2);
    }

    static boolean solution(int a, int b, int c) {
        if (a + b == c) {
            System.out.println(true);
            return true;
        }

        if (a - b == c) {
            System.out.println(true);
            return true;
        }

        if (a * b == c) {
            System.out.println(true);
            return true;
        }

        float total = (float)a / b;
        if (total == (int)c) {
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;

    }
}
