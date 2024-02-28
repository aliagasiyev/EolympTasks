package EolympTasks.ConditionsLoops;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int k= scanner.nextInt();
        if (k%2==0){
            System.out.println("EVEN");
        } else if (k%2==1) {
            System.out.println("ODD");
        }
    }
}
