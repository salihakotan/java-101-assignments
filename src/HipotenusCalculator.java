import java.util.Scanner;

public class HipotenusCalculator {

    public static void main(String[] args) {

            int a,b;
            double c;

        Scanner input = new Scanner(System.in);

        System.out.println("1.kenarı girin: ");
        a = input.nextInt();

        System.out.println("2.kenarı girin: ");
        b = input.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs: "+ c);

    }

}
