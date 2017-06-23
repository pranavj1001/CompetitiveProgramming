import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        string = string.toLowerCase();        
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char letters[] = abc.toCharArray();
        boolean isPangram = true;
        for(int i = 0; i < abc.length(); i++){
            if(string.contains(String.valueOf(letters[i])) == false){
                isPangram = false;
                break;
            }
        }
        if(isPangram){
            System.out.println("pangram");
        }
        else{
            System.out.println("not pangram");
        }
    }
}
