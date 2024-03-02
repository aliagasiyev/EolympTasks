package EolympTasks.Arrays;

import java.util.Scanner;

public class UseAFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        double maxXY = Math.max(x, y);
        double maxYZ = Math.max(y, z);
        double sum = x + y + z;
        double min = Math.min(maxXY, maxYZ);
        System.out.printf("%.2f", Math.min(sum, min));
    }
}











