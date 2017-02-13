//The Question for this solution can be found at https://www.hackerrank.com/challenges/new-year-chaos

import java.util.Scanner;

public class NewYearChaos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-->0){
            
            int n = sc.nextInt();
            int array[] = new int[n];
            for(int i=0; i < n; i++)
                array[i] = sc.nextInt();

            int bribe = 0;
            boolean chaotic = false;
            for(int i = 0; i < n; i++)
            {
                if(array[i]-(i+1) > 2)
                {               
                    chaotic = true;
                    break;     
                }
                for (int j = Math.max(0, array[i]-1-1); j < i; j++)
                    if (array[j] > array[i]) 
                        bribe++;
            }
            if(chaotic)
                System.out.println("Too chaotic");
            else
                System.out.println(bribe);
            
        }
        sc.close();
    }
}