import java.util.Scanner;

public class CircleAreaCalculator {
    public static void main(String[] args) {

        int r;

        double perimeter, pi =3.12,area;

        Scanner input  = new Scanner(System.in);
        System.out.println("Enter r: ");
        r = input.nextInt();

        perimeter = 2* pi*r;
        area = pi * (r*r);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);


    }
}
