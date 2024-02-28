package EolympTasks.ConditionsLoops;

import java.util.Scanner;

public class Conditional_statment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        long first_conditional = (x * x * x) + (5 * x);
        long second_conditional = (x * x) - (2 * x) + 4;
        if (x >= 10) {
            System.out.println(first_conditional);

        } else {
            System.out.println(second_conditional);
        }
    }
}
