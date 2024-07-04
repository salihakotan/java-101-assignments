import java.util.Scanner;

public class GradeAverage {

    public static int checkNote(int note){
        if(note < 0 || note > 100){
            return 0;
        } else {
            return note;
        }
    };


    public static void main(String[] args) {



        int mat, fizik,turkce,kimya,muzik;
        double average;



        Scanner input = new Scanner(System.in);

        System.out.println("Mat notu: ");
        mat = input.nextInt();


        System.out.println("Fizik notu: ");
        fizik = input.nextInt();


        System.out.println("Türkçe notu: ");
        turkce = input.nextInt();


        System.out.println("Kimya notu: ");
        kimya = input.nextInt();


        System.out.println("Müzik notu: ");
        muzik = input.nextInt();


        average = (checkNote(mat) + checkNote(fizik) + checkNote(turkce) + checkNote(kimya) + checkNote(muzik)) / 5;

        if(average <=55){
            System.out.println("Sınıfta kaldın. Seneye görüşürüz");
        }else {
            System.out.println("Sınıfı geçtiniz");
        }

        System.out.println("Ortalamanız: " + average);


    }
}
