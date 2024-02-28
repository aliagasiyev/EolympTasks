package EolympTasks.MixedTasks;

import java.util.Scanner;

public class knkn {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double n= scanner.nextDouble();
        double k= scanner.nextDouble();
       double a=Math.pow(2,n)+Math.pow(2,k);
        System.out.printf("%.0f",a);
    }
}
