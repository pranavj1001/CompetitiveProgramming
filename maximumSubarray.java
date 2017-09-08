import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for(int i = 0; i < testCases; i++){
            int len = sc.nextInt();
            int[] arr = new int[len];
            for(int j = 0; j < len; j++)
                arr[j] = sc.nextInt();
            int cont = 0, nonc = 0;
            cont = contiguous(arr, len);
            nonc = nonContiguous(arr, len);
            System.out.println(cont + " " + nonc);
        }
    }
	
	static int contiguous(int[] arr, int len) {
		int maxSoFar = arr[0];
		int currentMax = arr[0];
		 
		   for (int i = 1; i < len; i++) {
               
               if(arr[i] > currentMax + arr[i]){
                   currentMax = arr[i];
               }else{
                   currentMax += arr[i]; 
               }
               
               if(maxSoFar < currentMax){
                   maxSoFar = currentMax;
               }
		       
		   }
        
		   return maxSoFar;
	}
    
    static int nonContiguous(int[] arr, int len){
        int sum = 0, max = -10000;
        
        for(int value : arr){
            if(value > 0){
                sum += value;
            }else if(value <= 0 && max < value){
                max = value;
            }
        }
        
        if(sum == 0)
            return max;
        
        return sum;
    }
    
}
