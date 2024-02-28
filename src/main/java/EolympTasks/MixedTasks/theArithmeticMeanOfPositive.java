package EolympTasks.MixedTasks;

import java.util.Scanner;

public class theArithmeticMeanOfPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double plural = 0;
        int say = 0;

        double[] number = new double[n];
        {
            for (int i = 0; i < number.length; i++) {
                number[i] = scanner.nextDouble();
            }
            for (double sum : number) {
                if (sum > 0) {
                    plural += sum;
                    say++;
                }
            }
            if (say==0){
                System.out.println("Not Found");
            }
            else {
                System.out.printf("%.2f",plural/say);
            }
        }


    }
}