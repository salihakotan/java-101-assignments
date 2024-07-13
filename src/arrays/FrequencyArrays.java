package arrays;

import java.util.Arrays;

public class FrequencyArrays {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};


        System.out.print("Array: ");

        System.out.println(Arrays.toString(array));

        Arrays.sort(array);


        for(int i=0; i<array.length; i++){
            int counter = 1;
            while(i+1<array.length && array[i]==array[i+1]){
                i++;
                counter++;
            }
            System.out.println(array[i] + " appears " + counter + " times");
        }

    }
}
