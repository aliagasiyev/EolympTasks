package EolympTasks.MixedTasks;

import java.util.Scanner;

public class odd_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int sums : numbers) {
            if (sums % 2 != 0) {
                System.out.print(sums+" ");
            }
        }


    }
}