import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int n;

        n = Integer.parseInt(sc.nextLine());

        Map<String, Integer> map = new HashMap<String, Integer>(n);

        String str;

        for(int i=0; i<n; i++){

            str = sc.nextLine();

            if(map.containsKey(str))

                map.put(str, map.get(str)+1);

            else

                map.put(str, 1);

        }

        int q = Integer.parseInt(sc.nextLine());

        for(int i=0; i<q; i++){

          str = sc.nextLine();

          if(map.containsKey(str))

              System.out.println(map.get(str));

          else

              System.out.println('0');
          
          sc.close();

        }

    }
}