import java.util.Scanner;

public class AverageDivisibleNumbers {
    public static void main(String[] args) {

        float number,sum=0,count=0;
        double average;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        number = input.nextInt();

        for (int i = 0; i <= number; i++) {
                if((i%3 == 0) && (i%4==0)){
                    sum+=i;
                   if(i!=0){
                       count++;
                   }
                }
        }

        average = (sum/count);

        System.out.println("Average divisible(3,4) numbers: " + average);

    }
}
