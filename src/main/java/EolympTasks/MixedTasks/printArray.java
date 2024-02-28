package EolympTasks.MixedTasks;

import java.util.Scanner;

public class printArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a >= 1 && a <= 100) {
            int[] number = new int[a];

            for (int i = 0; i < number.length; i++) {
                number[i] = scanner.nextInt();
            }

            for (int numbs : number) {
                if (numbs <= 100) {
                    System.out.println(numbs);
                }
            }

        }
    }
}
