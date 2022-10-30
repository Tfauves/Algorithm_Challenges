package com.company.hackerRank.problemsolving;

// TODO: 10/30/2022 passes 24 out of 27.....getting closer 
public class DrawingBook {
    public static void main(String[] args) {
        pageCount(5, 4);
    }

    public static int pageCount(int bookLen, int targetPage) {
        // when page 1 is turned there are two pages
        // unless the page is the last then its only 1 facing page
        // page turn on ood len at every odd element

        int pageTurnsFront = 0;
        int pageTurnsBack = 0;
        int minPageTurns = 0;
//        int midOfBook = (int) Math.ceil((double)bookLen / 2);
//        System.out.println(midOfBook);

//        if (midOfBook == targetPage) {
//            return 0;
//        }
        
        if (targetPage == 1 || targetPage == bookLen) return 0;

        for (int pageFront = 1; pageFront <= bookLen; pageFront++) {
            if(pageFront == 1) {
                pageTurnsFront++;
                continue;
            }

            if(pageFront % 2 == 1 && pageFront != targetPage) {
                pageTurnsFront++;
            } else if (pageFront == targetPage) {
                break;
            }

        }

        for (int pageBack = bookLen; pageBack >= 1; pageBack--) {
            if (pageBack == targetPage) break;
            if (pageBack == bookLen && pageBack % 2 == 0) {
                pageTurnsBack++;
            }
            if(pageBack % 2 == 0) {
                pageTurnsBack++;
            }

        }

        if (pageTurnsFront > pageTurnsBack && pageTurnsBack != 0) {
            minPageTurns = pageTurnsBack;
        } else if (pageTurnsBack > pageTurnsFront && pageTurnsFront != 0) {
            minPageTurns = pageTurnsFront;
        }


//        System.out.println(pageTurnsFront);
//        System.out.println(pageTurnsBack);
        System.out.println(minPageTurns);
        return minPageTurns;
    }


}

////////////// first attempt ///////////////
//    int pagesToTurnFront = 0;
//    int pagesToTurnBack = 0;
//        if (bookLen == targetPage) {
//                return 0;
//                }
//
//                if((bookLen / 2) < targetPage) {
//        for (int i = bookLen; i >= targetPage; i--) {
//
//        if (bookLen % 2 == 0) {
//        pagesToTurnBack++;
//        }
//        if (i == targetPage) {
//        pagesToTurnBack++;
//        if (targetPage + 1 == bookLen) {
//        pagesToTurnBack--;
//        }
//        break;
//        }
////                pagesToTurnBack++;
//        }
//        } else {
//        for (int i = 1; i <= bookLen; i++) {
//        if (i == targetPage) {
//        break;
//        }
//        if (i % 2 == 1) {
//        if (i == targetPage) {
//        break;
//        }
//        pagesToTurnFront++;
//
//        }
//
//        }
//        }
//
//        if (pagesToTurnBack == 0) {
//        return pagesToTurnFront;
//        } else if (pagesToTurnFront == 0) {
//        return pagesToTurnBack;
//        } else {
//        System.out.println(Math.min(pagesToTurnFront, pagesToTurnBack));
//        return Math.min(pagesToTurnFront, pagesToTurnBack);
//        }
//
////
////        System.out.println(pagesToTurn);
////        return pagesToTurn;