package EolympTasks.MixedTasks;

import java.util.Scanner;

public class printLastDigit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int k=n%10;
        System.out.println(k);
    }
}
