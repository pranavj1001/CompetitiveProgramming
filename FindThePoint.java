//The Question for this solution can be found at https://www.hackerrank.com/challenges/find-point

import java.util.Scanner;

public class FindThePoint {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int px,py,qx,qy,rx,ry;
        for(int i = 0; i < n; i++){
            px = sc.nextInt();
            py = sc.nextInt();
            qx = sc.nextInt();
            qy = sc.nextInt();
            rx = 2*qx - px;
            ry = 2*qy - py;
            System.out.println(rx + " " + ry);
        }
        sc.close();
    }
}