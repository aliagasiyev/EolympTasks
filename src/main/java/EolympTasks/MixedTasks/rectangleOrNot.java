package EolympTasks.MixedTasks;

import java.util.Scanner;

public class rectangleOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a * a == b * b + c * c && a < b + c) {
            System.out.println("YES");
        } else if (b * b == a * a + c * c && b < a + c) {
            System.out.println("YES");

        } else if (c * c == a * a + b * b && c < a + b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
