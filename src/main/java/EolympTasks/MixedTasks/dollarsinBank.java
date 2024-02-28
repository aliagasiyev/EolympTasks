package EolympTasks.MixedTasks;

import java.util.Scanner;

public class dollarsinBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long s = scanner.nextLong();
        int n = 1;
        long gift = 1;
        long bank = 1;
        while (bank < s) {
            n++;
            gift = (gift * 2) + n;
            bank = bank + gift;
        }
        System.out.println(n);
    }
}

