package com.pranavjain.programming;

public class ReverseAString {

    public static void main(String[] args){

        String input = "Hello World!";

        StringBuilder stringBuilder = new StringBuilder(input);

        System.out.println(stringBuilder.reverse());

        char[] temp = input.toCharArray();

        for(int i = input.length()-1; i >= 0; i--)
            System.out.print(temp[i]);

    }

}
