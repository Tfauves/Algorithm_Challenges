package com.company.hackerRank.problemsolving;

// TODO: 10/29/2022 passing 6 cases so far 
public class DrawingBook {
    public static void main(String[] args) {
        pageCount(5, 4);
    }

    public static int pageCount(int bookLen, int targetPage) {
        // when page 1 is turned there are two pages
        // unless the page is the last then its only 1 facing page

        // page turn on ood len at every odd element

        int pagesToTurn = 0;

        if((bookLen / 2) < targetPage) {
            for (int i = bookLen; i >= targetPage; i--) {
                if (bookLen % 2 == 0) {
                    pagesToTurn++;
                }
                if (i == targetPage) {
                    break;
                }
                pagesToTurn++;
            }
        } else {
            for (int i = 1; i <= bookLen; i++) {

                if (i % 2 == 1) {
                    if (i == targetPage) {
                        break;
                    }
                    pagesToTurn++;

                }

            }


        }


        System.out.println(pagesToTurn);
        return pagesToTurn;

    }


}
