package com.company.hackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();
            ArrayList<Integer> list = new ArrayList<>();

            for (int j = 0; j < d; j++) {
                list.add(scanner.nextInt());
            }

            lists.add(list);
        }

        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (x > lists.size() || y > lists.get(x - 1).size()) {
                System.out.println("ERROR!");
            } else {
                System.out.println(lists.get(x - 1).get(y - 1));
            }
        }

        scanner.close();
    }
}
