package EolympTasks.ConditionsLoops;

import java.util.Scanner;

public class sign_Function {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x > 0) {
            System.out.println("1");

        } else if (x == 0) {
            System.out.println("0");

        } else if (x < 0) {
            System.out.println("-1");
        }
    }
}
