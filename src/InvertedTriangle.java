import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        int lineCount;

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter line count: ");
        lineCount = inp.nextInt();

        for (int i = 1; i <= lineCount ; i++) {
            for (int j = lineCount; j >=i ; j--) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
