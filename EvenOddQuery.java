
import java.util.*;

public class EvenOddQuery {
    
    static int[] array = new int[100008];
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n, queries, x, y;
        n = sc.nextInt();
        for(int i = 1; i <= n; i++)
            array[i] = sc.nextInt();
        queries = sc.nextInt();
        while(queries-->0){
            x = sc.nextInt();
            y = sc.nextInt();
            if(find(x,y))
                System.out.println("Odd");
            else
                System.out.println("Even");
        }
        sc.close();
    }
    
    private static boolean find(int a, int b){
        if(array[a]%2 == 1)
            return true;
        if(a == b)
            return false;
        if(array[a+1] == 0)
            return true;
        return false;
    }
    
}