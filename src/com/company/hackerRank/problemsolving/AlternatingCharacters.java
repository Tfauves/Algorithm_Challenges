package com.company.hackerRank.problemsolving;

public class AlternatingCharacters {
    public static void main(String[] args) {
        alternatingCharacters("AAAA");
    }

    public static int alternatingCharacters(String input) {
        int deleteCount = 0;
        // iterate the string by char
        // compare char to char +1
        // if they are the same delete count++
        // if not move to next char
        char[] charInput = input.toCharArray();
        for (int i = 0; i < charInput.length -1; i++) {

            if (charInput[i] == charInput[i + 1]) {
                deleteCount++;
            }
        }
        System.out.println(deleteCount);
        return deleteCount;

    }

}
