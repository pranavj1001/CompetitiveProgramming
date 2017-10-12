package com.pranavjain.programming;

public class Factorial {

    public static void main(String[] args){

        int n = 4, fact = 1;

        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        int fact1 = factorial(n);
        System.out.println(fact1);

        int input = fact;
        fact = 1;
        int i = 1;
        boolean notAFact = true;
        while(fact <= input){
            if(input == fact) {
                System.out.println("Factorial of " + i);
                notAFact = false;
            }
            i++;
            fact *= i;
        }
        if(notAFact)
            System.out.println("Not a Factorial");
    }

    public static int factorial(int n){

        if(n == 1)
            return 1;

        return n*factorial(n-1);
    }

}
