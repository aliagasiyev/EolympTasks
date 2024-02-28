package EolympTasks.ConditionsLoops;

import java.util.Scanner;

public class Conditional_statement_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int first_number = (x * x) - (3 * x) + 4;
        int secon_number = (x + 7);

        if (x < 5) {
            System.out.println(first_number);

        } else if (x>=5){
            System.out.println(secon_number);
        }
    }
}