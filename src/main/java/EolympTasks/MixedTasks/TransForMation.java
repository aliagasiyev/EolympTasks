package EolympTasks.MixedTasks;

import java.util.Scanner;

public class TransForMation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        while (n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
                sum += 1;
            } else {
                n++;    // Qeyd: Tek  ededi bir vahid ancaq artirirq burada bolme emeliyyat etmirik
                sum += 1;
            }
        }
        System.out.println(sum);


    }
}