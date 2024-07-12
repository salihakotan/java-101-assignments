package methods;

import java.util.Scanner;

public class RecursivePower {

    static int pow (int a,int b){
        if (b == 1) {
            return a;
        } else if (b == 0) {
            return 1;
        } else {
            return a * (pow(a, (b - 1)));
        }
    }


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a,b;
        System.out.println("Taban değeri: ");
        a = inp.nextInt();

        System.out.println("Üs değeri: ");
        b = inp.nextInt();



        System.out.println("Sonuç: " + pow(a,b));
    }
}
