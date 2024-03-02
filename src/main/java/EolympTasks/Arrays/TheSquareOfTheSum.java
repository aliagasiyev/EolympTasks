package EolympTasks.Arrays;

import java.util.Scanner;

public class TheSquareOfTheSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int fistnumber = (number / 10);
        int secondnumber = (number % 10);
        int sum = fistnumber + secondnumber;
        System.out.println(sum * sum);

    }
}




