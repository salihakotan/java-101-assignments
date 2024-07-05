import java.util.Scanner;

public class DigitSumCalculator {
    public static void main(String[] args) {

        int number, basamak=0,value,result=0;


        Scanner input = new Scanner(System.in);



        System.out.println("Enter a number: ");
        number = input.nextInt();

        int tempNumber = number;

        for (int i = 0; i <= tempNumber; i++) {
            tempNumber /= 10;
            basamak++;
        }

        tempNumber = number;

        for (int i = 1; i <= basamak; i++) {
            value = tempNumber%10;
            tempNumber /= 10;

            result += value;

        }


        System.out.println("RESULT: "+ result);

    }
}
