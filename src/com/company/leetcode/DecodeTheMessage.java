package com.company.leetcode;

import java.util.*;

// TODO: 1/11/2023 passing 35 0f 69 cases 
public class DecodeTheMessage {
    public static void main(String[] args) {

        String testKey = "the quick brown fox jumps over the lazy dog";
        String testMessage = "vkbs bs t suepuv";

        decodeMessage(testKey, testMessage);

    }

    public static String decodeMessage(String key, String message) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] splitKey = key.replaceAll(" ", "").toCharArray();
        Map<Character, Character> keyMap = new HashMap<>();
        StringBuilder returnStr = new StringBuilder();

        for (int i = 0; i < alphabet.length; i++) {
            if (!keyMap.containsKey(splitKey[i])) {
                keyMap.put(splitKey[i], alphabet[i]);
            }
        }

        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' ') returnStr.append(" ");
            if (keyMap.containsKey(message.charAt(i))) {
                returnStr.append(keyMap.get(message.charAt(i)));
            }
        }

        System.out.println(keyMap);
        System.out.println(returnStr.toString());
        return returnStr.toString();
    }
}
