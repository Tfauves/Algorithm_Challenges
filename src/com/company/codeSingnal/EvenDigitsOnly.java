package com.company.codeSingnal;
import java.util.LinkedList;

public class EvenDigitsOnly {
    public static void main(String[] args) {
        int n =  642386;
        solution(n);

    }

   public static boolean solution(int n) {
       LinkedList<Integer> stack = new LinkedList<Integer>();
       int count = 0;
       while (n > 0) {
           stack.push( n % 10 );
           n = n / 10;
       }

       while (!stack.isEmpty()) {
           if(stack.pop() % 2 == 1) {
               count++;
           }
       }
       if (count > 0) {
           System.out.println("false");
           return false;
       }
       System.out.println(count);
       System.out.println("true");
       return true;
    }
}
