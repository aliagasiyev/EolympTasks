package EolympTasks.ConditionsLoops;

import java.util.Scanner;

public class Inside_the_interval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (x >= a && x <= b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

