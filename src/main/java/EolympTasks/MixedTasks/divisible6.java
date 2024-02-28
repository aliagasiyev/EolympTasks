package EolympTasks.MixedTasks;

import java.util.Scanner;

public class divisible6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] number = new int[n];
        int sum=0;
        int say=0;
        for (int i = 0; i < n; i++) {
            number[i] = scanner.nextInt();
            if (number[i]>0 && number[i]%6==0){
                sum+=number[i];
                say+=1; // sert odendiyi qeder her defe 1 1 1 artacaq
            }
        }
        System.out.println(say+" "+sum);

    }
}
