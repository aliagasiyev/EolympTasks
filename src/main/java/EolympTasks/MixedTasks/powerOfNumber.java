package EolympTasks.MixedTasks;

import java.util.Scanner;

public class powerOfNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        double x=Math.pow(a,b);
        System.out.printf("%.0f",x);
    }
}
