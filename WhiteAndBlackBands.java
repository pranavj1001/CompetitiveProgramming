import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Pranav Jain on 05-Sep-17.
 */
public class WhiteAndBlackBands {

    public static void main(String args[]) {

        int numberOfPeople, maximumNumberOfPeople, sum = 0, flag;
        Scanner scan = new Scanner(System.in);
        numberOfPeople = scan.nextInt();
        int[] array = new int[numberOfPeople];

        for(int i = 0; i < numberOfPeople; i++)
            array[i] = scan.nextInt();

        maximumNumberOfPeople = (numberOfPeople - 1) * numberOfPeople;

        for(int value : array)
            sum += value;

        label:{
            if (sum > maximumNumberOfPeople) {
                System.out.println("-1");
            } else {
                flag = array[0];
                for (int value : array) {
                    if (flag != value) {
                        checkForNumberOfPeople(array);
                        break label;
                    }
                }
                System.out.println(numberOfPeople);
            }
        }

    }

    static private void checkForNumberOfPeople(int[] array){

        ArrayList<Integer> uniqueList = new ArrayList<Integer>(2);
        int length = 1;

        uniqueList.add(array[0]);

        label:
        {
            for (int value : array) {
                if (!uniqueList.contains(value)) {
                    length++;
                    if (length > 2) {
                        System.out.println("-1");
                        break label;
                    }
                    uniqueList.add(value);
                }
            }
            Collections.reverse(uniqueList);
            System.out.println(uniqueList.get(0));
        }

    }

}
