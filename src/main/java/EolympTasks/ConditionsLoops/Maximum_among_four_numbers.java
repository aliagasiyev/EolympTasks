package EolympTasks.ConditionsLoops;

import java.util.Scanner;

public class Maximum_among_four_numbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c =scanner.nextInt();
        int q= scanner.nextInt();
        System.out.println(Math.max(Math.max(a,b ),Math.max(c,q) ));

    }
}



