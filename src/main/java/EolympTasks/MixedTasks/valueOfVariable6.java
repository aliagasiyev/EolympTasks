package EolympTasks.MixedTasks;

import java.util.Scanner;

public class valueOfVariable6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ayri bir meselen mexres ve suretdeki emeliyyatlari yazanda her birini ayri ayri moterizeye alib yazmaliyiq
        double x = scanner.nextDouble();
        double y = Math.sqrt(x*x*x*x +1) / (x * x)  -  Math.sqrt(x * x / (x * x + 1));
        System.out.printf("%.3f", y);

    }
}
