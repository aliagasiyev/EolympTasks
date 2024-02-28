package EolympTasks.ConditionsLoops;

import java.util.Scanner;

public class None_of_the_two_conditions {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        if (number>0 && number%2==0){
            System.out.println("YES");

        } else if (number<0 || number%2==1) {
            System.out.println("NO");
        }
    }
}
