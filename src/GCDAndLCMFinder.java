import java.util.Scanner;

public class GCDAndLCMFinder {
    public static void main(String[] args) {
        int n1,n2, ebob = 1,ekok;

        Scanner input = new Scanner(System.in);

        System.out.print("n1: ");
        n1 = input.nextInt();

        System.out.print("n2: ");
        n2 = input.nextInt();

//        for (int i = 1; i <= n1 ; i++) {
//            if(n1%i==0 && n2%i==0){
//                ebob =i;
//            }
//        }

        int i =1;
        while (i<=n1 && i<n2){
            if(n1%i == 0 && n2%i ==0){
                ebob = i;
            }
            i++;
        }


        System.out.println("Ebob: " + ebob);
        System.out.println("Ekok: " + (n1*n2)/ebob);

    }
}
