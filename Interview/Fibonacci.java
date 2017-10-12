package com.pranavjain.programming;

public class Fibonacci {

    public static void main(String[] args){

        int n = 1;
        int fibo = 1, lfibo = 0;

        if(n == 1){
            System.out.println(lfibo);
        }else{
            System.out.println(lfibo);
            System.out.println(fibo);
            n -= 2;
            while(n > 0){
                fibo = fibo + lfibo;
                lfibo = fibo - lfibo;
                System.out.println(fibo);
                n--;
            }
        }

    }

}
