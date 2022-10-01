package com.company.hackerRank.problemsolving;
// TODO: 10/1/2022 passing some but not all cases 
import java.util.*;

public class SuperReducedString {
    public static void main(String[] args) {

        superReduceString("zztqooauhujtmxnsbzpykwlvpfyqijvdhuhiroodmuxiobyvwwxupqwydkpeebxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh");

    }

    public static String superReduceString(String s) {
        // create char array of string characters
        // iterate the char array and build new string with any remaining chars
        // if char array is empty return "Empty String"

        StringBuilder newStr = new StringBuilder();
        List<Character> inputToArr = new ArrayList<>();

        for (Character letter : s.toCharArray()) {
            inputToArr.add(letter);
        }

        for (int i = 1; i < inputToArr.size(); i++) {
            Character prev = inputToArr.get(i -1);
            Character current = inputToArr.get(i);

            if (current.equals(prev)) {

                inputToArr.remove(current);
                inputToArr.remove(prev);
                i = 0;
            }

        }

        for (Character letter : inputToArr) {
            newStr.append(letter);
        }


        if (newStr.isEmpty()) newStr.append("Empty String");
        System.out.println(newStr);
        return newStr.toString();
    }
    // tqauhujtmxnsbzpykwlvpfyqijvdhuhirdmuxiobyvxupqwydkpbxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh
}
