//The Question for this solution can be found at https://www.hackerrank.com/challenges/leonardo-and-prime

import java.util.Scanner;

public class PrimeFactors {  
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factors;
        long primeArray[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53}, number, primeFactor;

        for( int i = 0; i < n; i++){

            factors = 0;
            number = sc.nextLong();
            primeFactor = primeArray[0];
            for( int j = 1; j < primeArray.length && primeFactor <= number && number != 1; j++){
                primeFactor = primeFactor * primeArray[j];
                factors++;
            }
            System.out.println(factors);
            
         }
         sc.close();
    }
    
}

