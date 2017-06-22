import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int currentLetter = 0;
        String hackerrank = "hackerrank";
        for(int a0 = 0; a0 < q; a0++){
            String s = sc.next();
            // your code goes here
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == hackerrank.charAt(currentLetter)){
                    currentLetter++;
                    if(currentLetter == hackerrank.length()){
                        System.out.println("YES");
                        break;
                    }
                }
            }
            if(currentLetter != hackerrank.length()){
                System.out.println("NO");
            }
            currentLetter = 0;
        }
    }
}
