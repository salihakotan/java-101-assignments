import java.util.Scanner;

public class GradePointAverage {
    public static void main(String[] args) {


        int math, physic,biology,music;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter math note: ");
        math = input.nextInt();

        System.out.println("Enter physic note: ");
        physic = input.nextInt();

        System.out.println("Enter biology note: ");
        biology = input.nextInt();

        System.out.println("Enter music note: ");
        music = input.nextInt();

        double average = (math+physic+biology+music) / 4.0;

        System.out.println("Grade point average: " + average);

        if(average >= 60){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }


    }
}
