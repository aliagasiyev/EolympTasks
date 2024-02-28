package EolympTasks.ConditionsLoops;

import java.util.Scanner;

public class The_level_of_educational_achievements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number =scanner.nextInt();

        if (number>=1 && number<=3){
            System.out.println("Initial");

        } else if (number>=4 && number<=6) {
            System.out.println("Average");

        } else if (number>=7 && number<=9) {
            System.out.println("Sufficient");

        } else if (number>=10 && number<=12) {
            System.out.println("High");
        }
    }
}
