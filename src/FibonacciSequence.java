import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {

        int count,prev=0,first=0,second=1;

        Scanner inp = new Scanner(System.in);

        System.out.print("Fibonacci serisi eleman sayısı: ");
        count = inp.nextInt();

//        System.out.print(0);

        for (int i = 0; i <= count; i++) {
            System.out.print(first + " ");
            prev = first + second;
            first = second;
            second =prev;

        }

    }
}
