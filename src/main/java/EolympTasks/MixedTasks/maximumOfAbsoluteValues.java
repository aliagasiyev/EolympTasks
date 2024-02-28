package EolympTasks.MixedTasks;

import java.util.Scanner;

public class maximumOfAbsoluteValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] numbers = new double[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]= scanner.nextDouble();
        }
    }
}
