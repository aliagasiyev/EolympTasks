package EolympTasks.ConditionsLoops;

import java.util.Scanner;



public class At_least_one_condition_out_of_two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean b = false;
        if (n > 0 && String.valueOf(Math.abs(n)).length() == 3) {
            b = true;
        }
        if (n % 2 != 0) {
            b = true;
        }
        if (b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}

