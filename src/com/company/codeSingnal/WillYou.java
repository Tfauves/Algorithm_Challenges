package com.company.codeSingnal;

public class WillYou {
    public static void main(String[] args) {



    }

    boolean solution(boolean young, boolean beautiful, boolean loved) {

        if (young && beautiful && !loved) {
            return true;
        }

        if ( loved && !beautiful && !young) {
            return true;
        }

        if ( young && loved && !beautiful) {
            return true;
        }
        return !young && beautiful && loved;

    }
}
