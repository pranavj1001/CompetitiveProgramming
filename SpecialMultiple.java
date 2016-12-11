
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SpecialMultiple{
    
    static Queue<Long> queue;

    public static void main(String[] args){
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        queue = new LinkedList<Long>();
        queue.add(9L);
        while(testCases-->0)
            System.out.println(SpecialMultiple.solve(sc.nextInt()));
        sc.close();
    }
    
    public static Long solve(int N){
        while(true){
            Long current = queue.poll();
            if(current % N == 0){
                queue.clear();
                queue.add(9L);
                return current;
            }else{
                Long val = current * 10;
                queue.add(val);
                queue.add(val + 9);
            }
        }
    }
    
}