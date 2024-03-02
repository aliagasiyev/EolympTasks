package EolympTasks.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MedianNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[3];
        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }
        Arrays.sort(num);
        System.out.println(num[1]);




    }

}






