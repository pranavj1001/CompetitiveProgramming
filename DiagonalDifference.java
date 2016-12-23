//The Question for this solution can be found at https://www.hackerrank.com/challenges/diagonal-difference

import java.util.Scanner;

public class DiagonalDifference {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int d1 = 0, d2 = 0;
        int i,j;
        
        for(i = 0; i < n; i++)
            for(j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
        
        j = n-1;
        for(i = 0; i < n; i++){
            d1 += matrix[i][i];
            d2 += matrix[i][j];
            j--;
        }
        
        System.out.println(Math.abs(d1 - d2));
        sc.close();
        
    }
}