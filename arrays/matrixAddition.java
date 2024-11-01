import java.io.*;
import java.util.*;

public class Addition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of rows and columns of first matrix");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("Enter no.of rows and columns of second matrix");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
       
        if (r1 != r2 || c1 != c2) {
            System.out.println("Addition not possible matrix order doesn't match");
            System.exit(0);
        } else {
            int a[][] = new int[r1][c1];
            int b[][] = new int[r2][c2];
            System.out.println("Enter " + (r1 * c1) + " elements into matrix a");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter " + (r2 * c2) + " elements into matrix b");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    b[i][j] = sc.nextInt();
                }
            }
            int c[][] = new int[r1][c1];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    c[i][j] = a[i][j] + b[i][j];
                }
            }
            System.out.println("The resultant matrix c is: ");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
