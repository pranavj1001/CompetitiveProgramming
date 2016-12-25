
import java.util.Scanner;

public class TimeConversion {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        String changeHour = time.substring(0,2);
        time = time.substring(2);
        String ampm = time.substring(6);
        time = time.substring(0,6);
        //System.out.println(changeHour);
        //System.out.println(time);
        //System.out.println(ampm);
        int hour = Integer.parseInt(changeHour);
        String hourValue;
        if(ampm.equals("PM")){
            if(hour != 12){
                hour += 12;
            }
        }
        hourValue = String.valueOf(hour);
        if(ampm.equals("AM")){
            if(hour == 12)
                hourValue = "00";
            else if (hour < 10){
                hourValue = "0" + String.valueOf(hour);
            }
        }
        //System.out.println(hour);
        time = hourValue + time;
        System.out.println(time);
        sc.close();
    }
}