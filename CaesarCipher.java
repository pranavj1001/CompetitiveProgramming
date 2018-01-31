package com.pranavjain.programming;

// The Question for this program is at https://www.hackerrank.com/challenges/caesar-cipher-1/problem

import java.util.*;

public class CaesarCipher {

    static String caesarCipher(String s, int k) {
        // Complete this function
        char[] cArray = s.toCharArray();
        int i = 0;

        k = k % 26;

        if (k == 0) {
            return s;
        }

        for(char character : cArray) {
            int charToInt = (int) character;
            if ((charToInt >= 65) && (charToInt <= 90)) {
                int checkAddition = charToInt + k;
                if (checkAddition > 90) {
                    checkAddition = 64 + checkAddition - 90;
                }
                cArray[i] = (char) checkAddition;
            }
            if((charToInt >= 97) && (charToInt <= 122)) {
                int checkAddition = charToInt + k;
                if(checkAddition > 122) {
                    checkAddition = 96 + checkAddition - 122;
                }
                cArray[i] = (char) checkAddition;
            }
            i++;
        }
        return new String(cArray);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        String result = caesarCipher(s, k);
        System.out.println(result);
        in.close();
    }
}

