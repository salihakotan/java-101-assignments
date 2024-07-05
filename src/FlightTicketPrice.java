import java.util.Scanner;

public class FlightTicketPrice {
    public static void main(String[] args) {
        int mesafe, yas,tip;
        double perKm = 0.10f,normalFiyat,yasIndirimOrani,yasIndirimi,indirimliTutar,gidisDonusIndirimi;

        Scanner input = new Scanner(System.in);

        System.out.println("Mesafe (km): ");
        mesafe = input.nextInt();

        System.out.println("Yaşınız: ");
        yas = input.nextInt();

        System.out.println("Yolculuk tipi (1-Tek yön 2-Gidiş Dönüş): ");
        tip = input.nextInt();

        if(yas<=0 || yas>= 150 || (tip!=1 && tip!=2)) {
            System.out.println("Hatalı değerler girdiniz. ");
        }

        normalFiyat = mesafe * perKm;
        yasIndirimOrani = (yas < 12) ? 0.50f
                : (yas > 12 && yas <= 24) ? 0.10f
                : (yas >= 65) ? 0.30
                : 1.0f;


        yasIndirimi = normalFiyat * yasIndirimOrani;

        indirimliTutar = normalFiyat - (yasIndirimOrani == 1 ? 0 : yasIndirimi);
        gidisDonusIndirimi = indirimliTutar * 0.20f;

       if(tip == 1){
           System.out.println("Toplam tutar: " + (indirimliTutar));
       }else if(tip==2){
           System.out.println("Toplam tutar: " + ((indirimliTutar - gidisDonusIndirimi) *2));
       }




    }
}
