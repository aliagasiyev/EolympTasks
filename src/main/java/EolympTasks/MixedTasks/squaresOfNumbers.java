package EolympTasks.MixedTasks;

import java.util.Scanner;

public class squaresOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a, b;
        a = scanner.nextLong();
        for (long i = 1; i <= Math.sqrt(a); i++) {
            b = i * i;
            System.out.printf("%1d ", b);  // eger d den sonra qosa xetti uzatsaq cap olunan hisseler arasi mesafe artacaq

        }

    }
}
