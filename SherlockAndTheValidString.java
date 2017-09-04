import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockAndTheValidString {

    static int instance = 0;

    static String isValid(String s){

        if(instance > 1){
            return "NO";
        }

        // Complete this function
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        ArrayList<Integer> charOccurence = new ArrayList<Integer>();
        char[] arr = s.toCharArray();
        for (char value: arr) {

            if (charMap.containsKey(value)) {
                charMap.put(value, charMap.get(value) + 1);
            } else {
                charMap.put(value, 1);
            }
        }

        int flag = charMap.get(arr[0]);
        boolean yes = true;

        //System.out.println(charMap);

        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            int value = entry.getValue();
            if(flag != value){
                yes = false;
                break;
            }
        }

        if(yes){
            return "YES";
        }

        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();
            flag = --value;
            yes = true;
            if(flag == 0){
                s = s.replace(String.valueOf(key), "");
                instance++;
                String result = isValid(s);
                return result;
            }
            for (Map.Entry<Character, Integer> entry1 : charMap.entrySet()) {
                char key1 = entry1.getKey();
                int value1 = entry1.getValue();
                if(key != key1) {
                    //System.out.println(flag + " " + key + " " + key1 + " " + value1);
                    if (flag != value1) {
                        yes = false;
                        break;
                    }
                }
            }
        }

        if(yes){
            return "YES";
        }else{
            return "NO";
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = isValid(s);
        System.out.println(result);
    }
}
