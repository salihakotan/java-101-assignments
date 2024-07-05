import java.util.Scanner;

public class ExponentialNumberCalculation {
    public static void main(String[] args) {
        int n,k,total=1;

        Scanner input = new Scanner(System.in);

        System.out.println("Üssü alınacak sayı: ");
        n = input.nextInt();
        System.out.println("Üs olacak sayı: ");
        k = input.nextInt();

        for (int i = 0; i < k; i++) {
            total *= n;
        }

        System.out.println("Sonuç: " + total);

    }
}
