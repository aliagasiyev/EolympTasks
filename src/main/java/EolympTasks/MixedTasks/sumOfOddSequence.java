
package EolympTasks.MixedTasks;

import java.util.Scanner;

public class sumOfOddSequence {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int sum=0;
        int [] numbers=new int[n];
        for (int i=0;i<n;i++){
            numbers[i]= scanner.nextInt();
        }
        for (int j=0;j<n;j++){
            sum+=numbers[j];
            System.out.println(sum);
        }

    }
}

