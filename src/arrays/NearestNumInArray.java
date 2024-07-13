package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class NearestNumInArray {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        Arrays.sort(list);

        int nearestSmall = list[0];
        int nearestBig = list[0];
        int selectedNum;

        Scanner inp = new Scanner(System.in);
        System.out.println(Arrays.toString(list));
        System.out.println("Girilen sayı: ");
        selectedNum = inp.nextInt();

        for(int i : list){
            if(i<selectedNum){
                nearestSmall=i;
            }
        }

        for(int j : list){
            if(j>selectedNum){
                nearestBig=j;
                break;
            }
        }


        System.out.println("Girilen sayıdan küçük en yakın sayı " + nearestSmall);
        System.out.println("Girilen sayıdan büyük en yakın sayı " + nearestBig);
    }
}
