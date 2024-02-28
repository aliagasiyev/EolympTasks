package EolympTasks.MixedTasks;

import java.util.Scanner;

public class Perfect_square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextInt();
        double m = Math.sqrt(n);
        if (n % m == 0) {
            System.out.printf("%.0f",m);
        } else {
            System.out.println("No");
        }
    }
}


