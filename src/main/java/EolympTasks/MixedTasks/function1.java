package EolympTasks.MixedTasks;

import java.util.Scanner;

public class function1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextDouble()) {
            double x = scanner.nextDouble();
            double y = Math.pow(x, 3) + 2 * Math.pow(x, 2) - 3;
            System.out.printf("%.4f%n",y);
        }
    }
}
