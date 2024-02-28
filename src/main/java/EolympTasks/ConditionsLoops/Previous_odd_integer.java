package EolympTasks.ConditionsLoops;

import java.util.Scanner;

public class Previous_odd_integer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
            if (number % 2 == 0 ) {
                System.out.println(number - 1);

            } else if (number % 2 == 1) {
                System.out.println(number - 2);
            }
        }
    }
