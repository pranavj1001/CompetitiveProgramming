package com.pranavjain.programming;

public class Palindrome {

    public static void main(String[] args){
        int n = 45454;
        int temp = n;
        int sum = 0;
        while(n > 0){
            int r = n%10;
            sum = (sum*10) + r;
            n /= 10;
        }
        if(temp == sum)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");

        String input = "piuip";

        char[] temp1 = input.toCharArray();
        int j = temp1.length - 1;
        boolean palin = true;
        for(int i = 0; i < temp1.length; i++){
            if(i < j) {
                if (temp1[i] != temp1[j]) {
                    palin = false;
                    break;
                }
                j--;
            }else{
                break;
            }
        }

        if(palin)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");

    }

}
