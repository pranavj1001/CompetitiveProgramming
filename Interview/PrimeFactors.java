package com.pranavjain.programming;

public class PrimeFactors {

    public static void main(String[] args){

        int n = 56;
        int i = 2;
        while(n > 1){
            if(n % i == 0){
                System.out.print(i + " ");
                n /= i;
            }else{
                i++;
            }
        }

    }
}
