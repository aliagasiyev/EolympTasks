package EolympTasks.MixedTasks;

import java.util.Scanner;

public class function2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextDouble()) {
            double x = scanner.nextDouble();
            double y = Math.sqrt(x) + 2 * x + Math.sin(x);
            System.out.printf("%.4f%n",y);
        }
    }
}

