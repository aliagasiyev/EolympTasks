package EolympTasks.ConditionsLoops;

import java.util.Scanner;

public class Sum_of_digits {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int number= scanner.nextInt();
        int first_number=number/1000;
        int fourst_number=number%10;
        System.out.println(fourst_number+first_number);
    }
}
