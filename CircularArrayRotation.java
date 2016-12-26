//The Question for this solution can be found at https://www.hackerrank.com/challenges/circular-array-rotation


import java.util.Scanner;

public class CircularArrayRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] array = new int[n];
        int rotations = k%n;
        for(int a_i=0; a_i < n; a_i++){
            array[a_i] = in.nextInt();
        }
        for(int a0 = 0; a0 < q; a0++){
           int m = in.nextInt();
           if(m - rotations >= 0)
              System.out.println(array[m - rotations]);
           else
            System.out.println(array[m - rotations + array.length]);
        }
        in.close();                 
    }
        
    
}
