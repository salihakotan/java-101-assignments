import java.util.Scanner;

public class CombinationCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n,r,i,result;

        System.out.println("Enter n value: ");
        n = input.nextInt();

        System.out.println("Enter r value: ");
        r = input.nextInt();

        result = combination(n,r);

        System.out.println("C(" + "n" + "," + "r" + ") = " + result);

    }


    public static int factorial(int num){
        int total = 1;
        for (int i = 1; i <= num; i++) {
            total *= i;
        }

        return total;
    }

    public static int combination(int n, int r){

        return factorial(n) / (factorial(r) * factorial(n-r));
    }
}
