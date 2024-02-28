package EolympTasks.ConditionsLoops;

import java.util.Scanner;

public class Minimum_and_maximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        System.out.println(min + " " + max);
    }
}



