package arrays;

public class ArraysHarmonicAvarage {
    public static void main(String[] args) {

        double[] numbers = {1, 2, 3, 4, 5};
        double harmonicAverage;
        double harmonicSum=0;

        double[] harmonicSeries = new double[numbers.length];

        System.out.print("Harmonic serie: ");
        for (int i = 0; i < numbers.length; i++) {
            harmonicSeries[i] = (1/ numbers[i]);
            System.out.print(harmonicSeries[i] + ", ");
            harmonicSum += harmonicSeries[i];
        }

        harmonicAverage = numbers.length / harmonicSum;
        System.out.println("\nHarmonic average: " + harmonicAverage);

    }
}
