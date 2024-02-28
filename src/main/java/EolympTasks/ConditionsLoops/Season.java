package EolympTasks.ConditionsLoops;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int season = scanner.nextInt();
        if (season >= 3 && season <= 5) {
            System.out.println("Spring");

        } else if (season >= 6 && season <= 8) {
            System.out.println("Summer");

        } else if (season >= 9 && season <= 11) {
            System.out.println("Autumn");

        } else if (season >= 1 && season <= 2 || season == 12) {
            System.out.println("Winter");
        }
    }
}
