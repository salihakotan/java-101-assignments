import java.util.Scanner;

public class HoroscopeFinder {
    public static void main(String[] args) {
        int month,day;
        String burc = "";
        boolean isError = false;
        Scanner input = new Scanner(System.in);

        System.out.println("Doğduğunuz ay (1-12): ");
        month = input.nextInt();

        System.out.println("Doğduğunuz gün (1-31): ");
        day = input.nextInt();

        if(day < 1 || day > 31 || month < 1 ||month >12){
            isError = true;
        }

        if(isError){
            System.out.println("Hatalı değerler girdiniz");
            return;
        }


            if(month ==1){
                if (day <= 21){
                    burc = "Oğlak";
                }else {
                    burc = "Kova";
                }
            }else if(month ==2){
                if (day <= 19){
                    burc = "Kova";
                }else {
                    burc = "Balık";
                }
            }
            else if(month ==3){
                if (day <= 20){
                    burc = "Balık";
                }else {
                    burc = "Koç";
                }
            }else if(month ==4){
                if (day <= 20){
                    burc = "Koç";
                }else {
                    burc = "Boğa";
                }
            }else if(month ==5){
                if (day <= 21){
                    burc = "Boğa";
                }else {
                    burc = "İkizler";
                }
            }else if(month ==6){
                if (day <= 22){
                    burc = "İkizler";
                }else {
                    burc = "Yengeç";
                }
            }else if(month ==7){
                if (day <= 22){
                    burc = "Yengeç";
                }else {
                    burc = "Aslan";
                }
            }
            else if(month ==8){
                if (day <= 22){
                    burc = "Aslan";
                }else {
                    burc = "Başak";
                }
            }
            else if(month ==9){
                if (day <= 22){
                    burc = "Başak";
                }else {
                    burc = "Terazi";
                }
            }
            else if(month ==10){
                if (day <= 22){
                    burc = "Terazi";
                }else {
                    burc = "Akrep";
                }
            }else if(month ==11){
                if (day <= 21){
                    burc = "Akrep";
                }else {
                    burc = "Yay";
                }
            }else if(month ==12){
                if (day <= 21){
                    burc = "Yay";
                }else {
                    burc = "Oğlak";
                }
            }

        System.out.println("Burcunuz: "+ burc);


    }
}
