package EolympTasks.ConditionsLoops;

import java.util.Scanner;

public class Outside_the_interval {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int x= scanner.nextInt();
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        if (a>x || x>b){
            System.out.println("OUT");
        }
        else {
            System.out.println("IN");
        }

        }


    }

