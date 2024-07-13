package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Dizinin boyutunu girin: ");
        int n = inp.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.print((i+1) + ". elemanı girin: ");
            array[i] = inp.nextInt();
        }
        Arrays.sort(array);
        System.out.print("Siralama: ");

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
