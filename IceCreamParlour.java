//The Question for this solution can be found at https://www.hackerrank.com/challenges/icecream-parlor

import java.util.Scanner;

public class IceCreamParlour {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t,m,n,i,j,k;
        int[] cost;
        int[] id;
        int[] flavours = new int[2];
        Scanner sc = new Scanner(System.in);
        t=sc.nextInt();
        for(i=0;i<t;i++){
            m=sc.nextInt();
            n=sc.nextInt();
            cost = new int[n];
            id = new int[n];
            for(j=0;j<n;j++){
                cost[j]=sc.nextInt();
                id[j]=j+1;
            }
            for(j=0;j<n;j++){
                for(k=j+1;k<n;k++){
                    if(j!=k){
                        if((cost[j]+cost[k])== m){
                            flavours[0]=id[j];
                            flavours[1]=id[k];
                            break;
                        }
                    }
                    
                }
            }
            if(flavours[0]>flavours[1]){
                int temp;
                temp=flavours[0];
                flavours[0]=flavours[1];
                flavours[1]=temp;
            }
            System.out.println(flavours[0]+" "+flavours[1]);
        }
        sc.close();
    }
}

