package EolympTasks.MixedTasks;

import java.util.Scanner;

public class squareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a, b, c;
        a = n % 10;
        b = (n / 100);
        c = (n / 10) % 10;
        double sum = a + b + c;
        double sums2 = Math.sqrt(sum);
        System.out.printf("%.3f", sums2);

    }
}
