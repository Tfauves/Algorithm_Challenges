package com.company.leetcode;

public class ReversePrefixOfWord {
    public static void main(String[] args) {
        String input = "abcdefd";
        char ch = 'd';
        reversePrefix(input, ch);

    }

    public static String reversePrefix(String word, char ch) {
        StringBuilder prefix = new StringBuilder();
        StringBuilder pre = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == ch) {
                pre.append(word.substring(0, i + 1));
                prefix.append(word.substring(i + 1, word.length()));
                break;
            }

        }

        if (!pre.isEmpty()) {
            pre.reverse();
            prefix.insert(0,pre);

            System.out.println(prefix.toString());

            return prefix.toString();
        }
       return word;
    }


}
