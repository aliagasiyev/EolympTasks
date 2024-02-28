package EolympTasks.MixedTasks;

import java.util.Scanner;

public class function5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        long y= scanner.nextLong();
        long z= scanner.nextLong();
        long result = x * y * z + x + y*y + z*z*z;
        System.out.println(result);
    }
}
