package EolympTasks.Arrays;

import java.util.Scanner;

public class Rectangle2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

                int n = scanner.nextInt();
                int m= scanner.nextInt();

                for (int i = 1; i <= n; i++) {
                    for (int j=0;j<m;j++){
                        System.out.print("#");
                    }
                    System.out.println();
                }
            }
        }




