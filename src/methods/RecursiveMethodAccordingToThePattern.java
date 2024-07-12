package methods;

import java.util.Scanner;

public class RecursiveMethodAccordingToThePattern {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        methodOfThePattern(number, number - 5, true, true);
    }

    static void methodOfThePattern(int constantFirstNum, int processedNum, boolean isSubtraction, boolean firstTime){

        if(firstTime) System.out.print(constantFirstNum + " ");

        System.out.print(processedNum + " ");

        if(isSubtraction)
        {
            if(processedNum > 0) methodOfThePattern(constantFirstNum, processedNum - 5, true, false);
            else methodOfThePattern(constantFirstNum, processedNum + 5, false, false);
        }
        else
        {
            if(processedNum < constantFirstNum) methodOfThePattern(constantFirstNum, processedNum + 5, false, false);
        }
    }
}
