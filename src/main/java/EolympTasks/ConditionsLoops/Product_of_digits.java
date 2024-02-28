package EolympTasks.ConditionsLoops;

import java.util.Scanner;

public class Product_of_digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int first = number / 100;
        int second = number % 100;
        int secon2 = second / 10;
        int third = number % 100;
        int third2 = third % 10;

        System.out.println(first * secon2 * third2);

    }
}
