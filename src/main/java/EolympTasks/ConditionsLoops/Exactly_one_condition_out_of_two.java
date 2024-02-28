package EolympTasks.ConditionsLoops;

import java.util.Scanner;

public class Exactly_one_condition_out_of_two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        if ((n % 2 == 0 && (n >= 0 || n % 3 != 0)) || (n % 3 == 0 && n < 0 && n % 2 != 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }


}











