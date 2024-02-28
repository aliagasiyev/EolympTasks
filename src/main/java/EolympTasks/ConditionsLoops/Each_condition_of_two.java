package EolympTasks.ConditionsLoops;

import java.util.Scanner;

public class Each_condition_of_two {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number= scanner.nextInt();

        if (number%2==0 && String.valueOf(Math.abs(number)).length()==2 && number%3==0 ){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        }
    }

