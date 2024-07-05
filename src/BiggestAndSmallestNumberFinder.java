import java.util.Scanner;

public class BiggestAndSmallestNumberFinder {
    public static void main(String[] args) {
        int numberCount, biggest=0,smallest=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        numberCount = input.nextInt();


        for (int i = 1; i <= numberCount; i++) {
            System.out.print(i + ". sayı: ");
            int number = input.nextInt();
            if(number>biggest){
                biggest = number;
                smallest = number;
            }
            if(number<smallest){
                smallest = number;
            }
        }

        System.out.println("Biggest number: " + biggest);
        System.out.println("Smallest number: " + smallest);
    }
}
