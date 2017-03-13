import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int lastAns = 0;
        List<List> seqList = new ArrayList();
        
        for (int i = 0; i < n; i++){
            seqList.add(new ArrayList<Integer>());
        }
        
        for (int i = 0; i < q; i++){
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            List<Integer> seq = seqList.get((x^lastAns)%n);
            if (t==1){
                seq.add(y);
            } else {
                lastAns = seq.get(y%(seq.size()));
                System.out.println(lastAns);
            }
        }
        
        sc.close();
    }
}