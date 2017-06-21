import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String sos = "SOS";
        int numberOfWrongCharacters = 0;
        
        for (int i = 0; i < S.length(); i++)
            if (S.charAt(i) != sos.charAt(i % 3)) 
                numberOfWrongCharacters++;
        
        System.out.println(numberOfWrongCharacters);
        
    }
}
