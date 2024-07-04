import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        float height, weight,bmi;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your height(meter): ");
        height = input.nextFloat();

        System.out.println("Enter your weight(kg): ");
        weight = input.nextFloat();

        bmi = weight / (height*height);

        System.out.println("Your body mass index: " + bmi);

    }
}
