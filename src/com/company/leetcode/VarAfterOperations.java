package com.company.leetcode;

public class VarAfterOperations {
    public static void main(String[] args) {
        String [] test = {"++X","++X","X++"};

        finalValueAfterOperations(test);
    }

    public static int finalValueAfterOperations(String[] operations) {

        int X = 0;
        for(String ops : operations) {
           if (ops.equals("--X")) --X;
           if (ops.equals("X--")) X--;
           if (ops.equals("++X")) ++X;
           if(ops.equals("X++")) X++;
        }
        System.out.println(X);
        return X;
    }
}

///// better solution /////
//public int finalValueAfterOperations(String[] operations) {
//    int total = 0;
//    for(String s : operations){
//        if(s.charAt(1)=='-'){
//            total--;
//        }
//        else {
//            total++;
//        }
//    }
//    return total;
//}
