// Problem Statement: https://www.hackerrank.com/challenges/camelcase/problem 

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char[] chars = s.toCharArray();
        int count = 1;
        for(char ch: chars){
            if(Character.isUpperCase(ch))
                count++;
        }
        System.out.println(count);
    }
}
