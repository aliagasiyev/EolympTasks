package EolympTasks.ConditionsLoops;


import java.util.Scanner;

public class Two_digit_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number >= 10 && number <= 99) {
            System.out.println("Ok");
        } else if (number <= -10 && number >= -99) {

            System.out.println("Ok");
        } else {
            System.out.println("No");
        }
    }
}
