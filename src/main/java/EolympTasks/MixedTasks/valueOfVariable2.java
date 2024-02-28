package EolympTasks.MixedTasks;

import java.util.Scanner;

public class valueOfVariable2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double x= scanner.nextDouble();
        double y=x-((Math.pow(x,2))+4)/2+Math.pow(x,3)-3/(x+7);
        System.out.printf("%.3f",y);
    }
}
