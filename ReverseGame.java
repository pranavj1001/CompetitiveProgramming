//The Question for this solution can be found at https://www.hackerrank.com/challenges/reverse-game

import java.util.Scanner;

public class ReverseGame {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-->0){
            int n = sc.nextInt();
            int[] array = new int[n];
            int j, k = 0;
            for(int i = 0; i < n; i++){
                array[i] = i;
            }
            j = 0;
            while(j != n){
            	reverseArray(array, j, n-1);
            	j++;
            }
            int check = sc.nextInt();
            for(int x : array){
                if(x == check){
                    break;
                }
                k++;
            }
            System.out.println(k);
        }
        sc.close();
    }
    static void reverseArray(int arr[], int start, int end) {
        int temp;
        if (start >= end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start+1, end-1);
    }
}
