package EolympTasks.ConditionsLoops;

import java.util.Scanner;

public class Water_and_Ice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        if (t>0){
            System.out.println("Water");
        }
        else {
            System.out.println("Ice");
        }
    }
}
