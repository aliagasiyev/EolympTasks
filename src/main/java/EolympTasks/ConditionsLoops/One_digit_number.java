package EolympTasks.ConditionsLoops;

import java.util.Scanner;

public class One_digit_number {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number= scanner.nextInt();

        if (number<=9 && number>=-9){
            System.out.println("Ok");
        }
        else {
            System.out.println("No");
        }



    }
}
