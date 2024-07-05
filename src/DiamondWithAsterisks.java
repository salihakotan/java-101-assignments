import java.util.Scanner;

public class DiamondWithAsterisks {

    public static void main(String[] args) {
        int n;
        int half;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter line number: ");
        n = input.nextInt();
        half = n/2;

        for (int i = 1; i <= half ; i++) {

            for (int j = 1; j <= (half-i) ; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2*i -1) ; k++) {
                System.out.print("*");
            }

            System.out.println();
        }


        for (int i = 1; i <= half+1 ; i++) {

            for (int j = half-1; j > (half-i) ; j--) {
                System.out.print(" ");
            }

            for (int k = n; k > (2*i -1) ; k--) {
                System.out.print("*");
            }

            System.out.println();


        }




    }
}
