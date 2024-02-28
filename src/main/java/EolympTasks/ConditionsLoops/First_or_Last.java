package EolympTasks.ConditionsLoops;

import java.util.Scanner;

public class First_or_Last {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number= scanner.nextInt();
        int first=number/100;
        int second=number%10;
        if (first>second){
            System.out.println(first);
        }
        else if (second>first){
            System.out.println(second);
        }
        else {
            System.out.println("=");
        }

    }
}

