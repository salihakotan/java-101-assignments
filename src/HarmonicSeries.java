import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        double result = 0;

        int n;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter n value: ");
        n = input.nextInt();

        for (int i = 1; i <= n ; i++) {
            result += (1.0/i);
        }

        System.out.println("Result: " + result);
    }
}
