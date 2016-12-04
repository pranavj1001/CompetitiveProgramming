//The Question for this solution can be found at https://www.hackerrank.com/challenges/summing-the-n-series
import java.util.Scanner;
import java.math.BigInteger;

public class SummingNSeries {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int testCases;
        Scanner sc  = new Scanner(System.in);
        testCases = sc.nextInt();
        while(testCases-->0){
            BigInteger bb= new BigInteger(sc.next());
            bb=bb.multiply(bb);
            bb=bb.mod(BigInteger.valueOf(1000000007));
            System.out.println(bb);
        }
        sc.close();
    }
}