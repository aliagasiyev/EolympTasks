package EolympTasks.MixedTasks;

import java.util.Scanner;

public class function3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextDouble()) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            double sum = x * x + Math.sin(x * y) - y * y;
            System.out.printf("%.4f%n", sum);
        }
    }
}


