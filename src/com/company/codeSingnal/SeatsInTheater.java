package com.company.codeSingnal;

public class SeatsInTheater {
    public static void main(String[] args) {
        solution(16, 11, 5, 3);
    }

    static int solution(int nCols, int nRows, int col, int row) {
        int trailingRows = row - nRows;
        int colTotal = (col -1) - nCols ;

        System.out.println(colTotal * trailingRows);
        return colTotal * trailingRows;

    }

}