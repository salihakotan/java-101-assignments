import java.util.Scanner;

public class TaximeterCalculator {
    public static void main(String[] args) {

        int km;
        double perKm=2.20, total,startPrice=10;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter km: ");
        km = input.nextInt();

        total = startPrice + (perKm*km);
        total = (total<20) ? 20 : total;

        System.out.println("Total: " + total);




    }
}
