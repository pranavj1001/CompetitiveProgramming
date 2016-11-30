//The Question for this solution can be found at https://www.hackerrank.com/challenges/handshake

import java.util.Scanner;

public class HandShake {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            int n = sc.nextInt();
            int handShake = ((n*(n-1))/2);
            System.out.println(handShake);
        }
        sc.close();
    }
}

