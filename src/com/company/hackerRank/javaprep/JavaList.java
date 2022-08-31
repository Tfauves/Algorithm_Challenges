package com.company.hackerRank.javaprep;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

    public static void main(String[] args) {
        /*
        fist input is the len of list
        second is the list
        third is num of queries

        if the fist line of the query is Insert then it is followed
        by ints x and y
        y must be inserted into the list at index x

        if the first line is Delete the the next line is int x
        denoting the index of the element to be deleted

        print the updated list on a single line.
        */
        Scanner scanner = new Scanner(System.in);
        String insert = "Insert";
        String delete = "Delete";

        List<Integer> myList = new ArrayList<>();

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int element = scanner.nextInt();
            myList.add(element);
        }

        int Q = scanner.nextInt();

        for (int i = 0; i < Q; i++) {
            String query = scanner.next();
            if (query.equals(insert)) {
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                myList.add(index, value);
            }
            else if (query.equals(delete)) {
                int index = scanner.nextInt();
                myList.remove(index);
            }
        }

        for (Integer ele : myList) {
            System.out.print(ele + " ");
        }
    }

}
