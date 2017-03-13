import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n;i++) {
            array[(i+n-d)%n] = sc.nextInt();
        }
        for(int i=0; i<n;i++) {
            System.out.print(array[i] + " ");
        }
        sc.close();
    }
}