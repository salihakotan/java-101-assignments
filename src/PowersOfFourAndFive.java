import java.util.Scanner;

public class PowersOfFourAndFive {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        number = input.nextInt();


        for (int i = 1,j=1,k=0; i <= number || j<= number;k++, i*=4, j*=5) {
            System.out.println("4^ "+k +" = "+ i);
            System.out.println("5^ "+k +" = "+j);

        }
        

    }
}
