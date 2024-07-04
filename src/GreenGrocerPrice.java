import java.util.Scanner;

public class GreenGrocerPrice {
    public static void main(String[] args) {

        int armut,elma,domates,muz,patlican;
        float totalPrice, armutPrice =2.14f,elmaPrice=3.67f,domatesPrice=3.11f,muzPrice=0.95f,patlicanPrice=5f;

        Scanner input = new Scanner(System.in);

        System.out.println("Armut kaç kilo: ");
        armut = input.nextInt();

        System.out.println("Elma kaç kilo: ");
        elma = input.nextInt();

        System.out.println("Domates kaç kilo: ");
        domates= input.nextInt();


        System.out.println("Muz kaç kilo: ");
        muz = input.nextInt();

        System.out.println("Patlıcan kaç kilo: ");
        patlican = input.nextInt();

        totalPrice = (armut * armutPrice) + (elmaPrice * elma) + (domatesPrice * domates) + (muzPrice * muz) + (patlicanPrice * patlican);


        System.out.println("Total price: " + totalPrice);
    }
}
