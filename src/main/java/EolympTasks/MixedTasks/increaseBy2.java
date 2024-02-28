package EolympTasks.MixedTasks;

import java.util.Scanner;

public class increaseBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 100) {
            int[] numbers = new int[n];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = scanner.nextInt();
                {
                    if (numbers[i] <= 100)
                        if (numbers[i] >= 0) {
                            numbers[i] += 2;
                            System.out.print(numbers[i] + " ");
                        } else {
                            System.out.print(numbers[i] + " ");
                        }

                }
            }
        }
    }
}