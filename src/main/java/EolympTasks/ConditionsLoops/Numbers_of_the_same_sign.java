package EolympTasks.ConditionsLoops;

import java.util.Scanner;

public class Numbers_of_the_same_sign {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*int n= scanner.nextInt();
        int m= scanner.nextInt();

        if (n!=0 && m!=0 && n>0 && m>0){
            System.out.println("1");
        }
        else if (n<0 || m<0){
            System.out.println("0");
        }*/




            int n = scanner.nextInt();
            int m = scanner.nextInt();

            if ((n > 0 && m > 0) || (n < 0 && m < 0)) {
                System.out.println("1");
            } else if ((n > 0 && m < 0) || (n < 0 && m > 0)) {
                System.out.println("0");
            }
        }
    }
















