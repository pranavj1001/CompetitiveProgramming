package com.pranavjain.programming;

import java.util.Scanner;

public class FindFibonacci {

    private static int fibo = 1, lfibo = 0;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println( (fibonacci(num)) ? "yes, its a fibonacci" : "no its not a fibonacci" );

    }

    private static boolean fibonacci(int num){

        if(num == 0)
            return true;

        while(fibo <= num){
            if (num == fibo)
                return true;

            fibo += lfibo;
            lfibo = fibo - lfibo;
        }

        return false;

    }

}
