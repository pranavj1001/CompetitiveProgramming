import java.util.Scanner;

public class DecimalToBinary {

    public static void main (String args[]){

        Scanner sc =  new Scanner(System.in);

        int binaryNumber = sc.nextInt();
        String temp = "";

        if(binaryNumber == 0){
            System.out.println("0");
        }else if(binaryNumber == 1){
            System.out.println("1");
        }else{
            while (binaryNumber > 1){
                if(binaryNumber % 2 == 0)
                    temp = "0" + temp;
                else
                    temp = "1" + temp;
                binaryNumber /= 2;
            }
            System.out.println("1" + temp);
        }

        sc.close();

    }

}
