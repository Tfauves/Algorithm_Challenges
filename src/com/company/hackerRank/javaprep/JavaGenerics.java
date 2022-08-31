package com.company.hackerRank.javaprep;

public class JavaGenerics {
    public <T> void printArray(T[] array) {
        for (T ele : array) {
            System.out.println(ele);
        }
    }
}
