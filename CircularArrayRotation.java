//The Question for this solution can be found at https://www.hackerrank.com/challenges/circular-array-rotation

import java.util.Scanner;

public class CircularArrayRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] array = new int[n];
        int[] queries = new int[q];
        for(int a_i=0; a_i < n; a_i++){
            array[a_i] = in.nextInt();
        }
        for(int a0 = 0; a0 < q; a0++){
            queries[a0] = in.nextInt();
        }
        
        for(int i = 0; i < k; i++)
            performCircularRotation(array, n);
        
        for(int i = 0; i < q; i++)
            System.out.println(array[queries[i]]);
        
        in.close();
        
    }
    
    private static void performCircularRotation(int[] array, int n){
        int[] newArray = new int[n];
        for(int i = 0; i < n-1; i++){
            newArray[i+1] = array[i];
        }
        newArray[0] = array[n-1];
        for(int i = 0; i < n; i++){
            array[i] = newArray[i];
        }
    }
    
}
