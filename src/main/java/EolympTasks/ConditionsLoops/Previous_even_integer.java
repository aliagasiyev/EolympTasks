package EolympTasks.ConditionsLoops;

import java.util.Scanner;

public class Previous_even_integer {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();

        if(a%2==0){
            System.out.println(a-2);
        }
        else {
            System.out.println(a-1);
        }



    }
}
