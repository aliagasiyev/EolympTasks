package EolympTasks.MixedTasks;

import java.util.Scanner;

public class theRatioOfProductToTheSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int cem = 0;
        int hasil = 1;
        for (int i = 0; i < n.length(); i++) {
            int numbers = Character.getNumericValue(n.charAt(i));
            cem += numbers;
            hasil *= numbers;
        }

        double result = (double) hasil / cem;
        System.out.printf("%.3f", result);


    }


}