// Question: https://www.hackerrank.com/challenges/strong-password/problem

import java.io.*;
import java.util.*;

public class StrongPassword {

    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        char[] passwordArray = password.toCharArray();
        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";
        
        int count = 4;
        boolean flag_numbers = true;
        boolean flag_lower_case = true;
        boolean flag_upper_case = true;
        boolean flag_special_characters = true;
        
        for(char c : passwordArray) {

            if(numbers.indexOf(c) >= 0 && flag_numbers) {
                count--;
                flag_numbers = false;
            }

            if(lower_case.indexOf(c) >= 0 && flag_lower_case) {
                count--;
                flag_lower_case = false;
            }

            if(upper_case.indexOf(c) >= 0 && flag_upper_case) {
                count--;
                flag_upper_case = false;
            }

            if(special_characters.indexOf(c) >= 0 && flag_special_characters) {
                count--;
                flag_special_characters = false;
            }

        }

        if((6 - n) > count) {
            return 6 - n;
        } else {
            return count;
        }
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
