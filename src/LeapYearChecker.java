import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        int year;
        boolean isLeap=false;

        Scanner input = new Scanner(System.in);

        System.out.println("Yıl giriniz: ");
        year = input.nextInt();

        if(year%4 ==0){
            isLeap = true;
        }

        if(year%100 == 0){
            if(year%400==0){
                isLeap =true;
            }else {
                isLeap=false;
            }

        }

        if(isLeap){
            System.out.println(year + " is a leap year");
        }else {
            System.out.println(year + " is not a leap year");
        }
    }
}
