//The Question for this solution can be found at https://www.hackerrank.com/challenges/saveprincess

import java.util.Scanner;

public class StairCase {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = i; j < n-1; j++){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                System.out.print("#");
            }
            System.out.println();
        }
        sc.close();
    }
}