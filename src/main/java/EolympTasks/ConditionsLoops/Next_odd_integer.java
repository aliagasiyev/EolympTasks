package EolympTasks.ConditionsLoops;

import java.util.Scanner;

public class Next_odd_integer {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        if (n%2==0){
            System.out.println(n+2);
        }
        else {
            System.out.println(n+1);
        }
    }
}
