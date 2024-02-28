package EolympTasks.ConditionsLoops;

import java.util.Scanner;

public class Street_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean sameSide = (n + m) % 2 == 0;

        if (sameSide) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

    }
}




