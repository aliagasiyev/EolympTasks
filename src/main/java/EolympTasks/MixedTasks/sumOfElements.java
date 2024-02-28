package EolympTasks.MixedTasks;

import java.util.Scanner;

public class sumOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        double[] number=new double[n];
        for (int i=0;i< number.length;i++){
            number[i]=scanner.nextDouble();
        }
        double sum=0;
        for (double num:number){
            sum+=num;
        }
        System.out.println(sum);

    }
}





