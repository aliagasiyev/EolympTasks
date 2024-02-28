package EolympTasks.MixedTasks;

import java.util.Scanner;

public class theFirstIsNotGreaterFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] numbers = new double[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();
        }
        double boyuk = 0;
        for (int j = 0; j < n; j++) {
            if (numbers[j]>boyuk){
                boyuk=numbers[j];
            }
        }
        System.out.println(boyuk);
    }
}


