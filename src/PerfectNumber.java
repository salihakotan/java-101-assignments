import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int number,sum=0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = inp.nextInt();

        for (int i = 1; i <= number ; i++) {
            if(number%i==0 && number!=i){
                sum+=i;
            }
        }

        if(sum == number){
            System.out.println(number + " is a perfect number");
        }else {
            System.out.println(number + " is not a perfect number");
        }


    }
}
