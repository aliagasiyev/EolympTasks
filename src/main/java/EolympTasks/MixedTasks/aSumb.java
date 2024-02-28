package EolympTasks.MixedTasks;


import java.util.Scanner;

public class aSumb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eded = scanner.nextInt();
        while (eded > 1) {
            eded /= 2;
            System.out.println(eded);
        }
        scanner.close();
    }
}