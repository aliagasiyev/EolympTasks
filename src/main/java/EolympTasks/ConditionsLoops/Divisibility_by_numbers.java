package EolympTasks.ConditionsLoops;

import java.util.Scanner;

public class Divisibility_by_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        if (a % b == 0 && a % n == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
