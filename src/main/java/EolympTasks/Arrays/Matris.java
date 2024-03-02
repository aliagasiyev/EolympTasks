package EolympTasks.Arrays;

import java.util.Scanner;

public class Matris {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int m= scanner.nextInt();
        int elements=1;

        int [][] numbers=new int[n][m];
        for (int i=0;i<numbers.length;i++){
            for (int j=0;j<numbers[i].length;j++){
                numbers[i][j]=elements;
                System.out.print(numbers[i][j]+" ");
                elements++;

            }
            System.out.println();
        }
    }
}
