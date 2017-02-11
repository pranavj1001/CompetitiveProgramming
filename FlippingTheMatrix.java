//The Question for this solution can be found athttps://www.hackerrank.com/challenges/flipping-the-matrix

import java.util.Scanner;

public class FlippingTheMatrix { 
    public static void main(String[] args) { 
        
        Scanner sc = new Scanner(System.in); 
        int q = sc.nextInt(); 
        int max; 
        int a[][]=new int[256][256];

        for(int i=0; i<q; i++){
            int n = sc.nextInt();
            for(int j=0; j<2*n; j++){
                for(int k=0; k<2*n; k++){
                    a[j][k] = sc.nextInt();
                }
            }
            int sum=0;
            for(int j=0; j<n; j++){
                max=0;
                for(int k=0; k<n; k++){
                    max = Math.max(Math.max(a[j][k],a[j][(2*n)-k-1]),Math.max(a[(2*n)-j-1][(2*n)-k-1],a[(2*n)-j-1][k]));
                    sum += max;
                }
            }
            System.out.println(sum);
        }
        sc.close();
    }

}