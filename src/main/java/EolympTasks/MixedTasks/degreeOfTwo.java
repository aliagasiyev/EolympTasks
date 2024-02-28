package EolympTasks.MixedTasks;

import java.util.Scanner;

public class degreeOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 1) {
            System.out.println("YES");
            return;
        }
        while (n > 0) {
            if (n > 2) {
                n = n / 2;
            } else if (n == 1) {
                System.out.println("NO");
                break;
            } else {
                System.out.println("YES");
                break;
            }
        }
    }
}



