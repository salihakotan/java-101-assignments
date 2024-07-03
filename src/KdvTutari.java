import java.util.Scanner;

public class KdvTutari {

    public static void main(String[] args) {
        double tutar, kdvliTutar,kdvTutari,kdvOrani = 0.18;


        Scanner input = new Scanner(System.in);

        System.out.println("Tutarı giriniz: ");

        tutar = input.nextDouble();

        kdvTutari = 0.18 * tutar;
        kdvliTutar = tutar + kdvTutari;



        System.out.println("Kdvsiz tutar: " + tutar);
        System.out.println("Kdv oranı: " + kdvOrani);
        System.out.println("Kdv tutarı: " + kdvTutari);
        System.out.println("Kdvli tutar: " + kdvliTutar);

    }


    }
