//The Question for this solution can be found at https://www.hackerrank.com/challenges/sherlock-and-moving-tiles

import java.util.Scanner;

public class SherlockAndMovingTiles {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int lengthOfSide = sc.nextInt();
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        
        double x = Math.sqrt(2);
        double diag = x * lengthOfSide;
        int s3 = Math.abs(s1-s2);
        
        int testCases = sc.nextInt();
        
        for(int i = 0; i < testCases; i++){    
            double distance = sc.nextDouble();
            double diag2 = x * Math.sqrt(distance);
            if(s3 != 0){
                double result = (Math.abs(diag-diag2)) / s3;
                System.out.println(result);
            }else{
                System.out.println(0.00000000000000);
            }    
        }
        
        sc.close();
    }
}
