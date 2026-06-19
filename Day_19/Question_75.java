// Code to find transpose of a matrix
import java.util.*;
public class Question_75
 {
    public static void main(String[] args) 
        {
           int r1;
           int c1;
           Scanner sc = new Scanner(System.in);
           System.out.print("Enter the row of 1st matrix : ");
           r1 = sc.nextInt(); 
           System.out.print("Enter the column of 1st matrices : ");
           c1 = sc.nextInt();
           int[][] mat1 = new int[r1][c1];
           for(int i =0;i<r1;i++)
            {
            for(int j =0;j<c1;j++)
            {
            System.out.print("Enter mat1["+i+"]["+j+"] : ");
            mat1[i][j] = sc.nextInt();
           }
           }
           System.out.println("The transpose of the matrix is : ");
          for(int i =0;i<c1;i++)
            {
            for(int j =0;j<r1;j++)
            {
                System.out.print(" "+mat1[j][i]);
            }
            System.out.println("");
            }
        }
}
