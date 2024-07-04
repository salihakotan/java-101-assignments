import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int n1,n2,choose;

        Scanner input = new Scanner(System.in);

        System.out.println("1.sayı: ");
        n1 = input.nextInt();

        System.out.println("2.sayı: ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Bölme\n4-Çarpma");
        System.out.println("Seçiminiz: ");
        choose = input.nextInt();


        switch (choose){
            case 1:
                System.out.println("Result: " + (n1+n2));
                break;
            case 2:
                System.out.println("Result: " + (n1-n2));
                break;
            case 3:
                if(n2 != 0){
                    System.out.println("Result: " + (n1/n2));
                }else {
                    System.out.println("Not valid division to 0. Try again");
                }
                break;
            case 4:
                System.out.println("Result: " + (n1*n2));
                break;
            default:
                System.out.println("Please enter valid values");
                break;
        }

    }
}
