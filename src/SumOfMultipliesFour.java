import java.util.Scanner;

public class SumOfMultipliesFour {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number=0,sum=0;


        do{
            System.out.println("Bir sayı giriniz: ");
            number = input.nextInt();
            if(number%4==0){
                sum += number;
            }
        }while(number%2==0);



        System.out.println("4'ün katları toplamı: " + sum);
        


    }
}
