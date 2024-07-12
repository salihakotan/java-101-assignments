package methods;

import java.util.Scanner;

public class RecursivePrimeNumber {

    static boolean isPrime(int number, int divisor){
        if (number < 2)
            return false;
        if (divisor == 1)
            return true;
        if (number % divisor == 0)
            return false;
        return isPrime(number, divisor - 1);
    }


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num;
        System.out.println("Sayı girin: ");
        num = inp.nextInt();

        boolean result = isPrime(num,num-1);

        if (result)
            System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is not a prime number");

        inp.close();


    }
}
