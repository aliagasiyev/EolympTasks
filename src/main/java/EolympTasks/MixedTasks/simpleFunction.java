package EolympTasks.MixedTasks;

import java.util.Scanner;

public class simpleFunction {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double x= scanner.nextDouble();
        double result =x+Math.sin(x);
        System.out.printf("%.4f",result);


    }
}
