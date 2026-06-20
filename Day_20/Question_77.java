// Code to find multiplication of two matrices.
import java.util.*;
public class Question_77 {
    public static void main(String[] args) 
        {
           int r1;
           int c1;
           Scanner sc = new Scanner(System.in);
           System.out.print("Enter the row of 1st matrix : ");
           r1 = sc.nextInt(); 
           System.out.print("Enter the column of 1st matrices : ");
           c1 = sc.nextInt();
           int r2;
           int c2;
           System.out.print("Enter the row of 2nd matrix  : ");
           r2 = sc.nextInt(); 
           System.out.print("Enter the column of2nd matrix : ");
           c2 = sc.nextInt();
           if(c1==r2)
           {
           int[][] mat1 = new int[r1][c1];
           for(int i =0;i<r1;i++)
            {
            for(int j =0;j<c1;j++)
            {
            System.out.print("Enter mat1["+i+"]["+j+"] : ");
            mat1[i][j] = sc.nextInt();
           }
           }
           int mat3[][] = new int[r1][c2];
            int[][] mat2 = new int[r2][c2];
            for(int i =0;i<r2;i++)
           {
            for(int j =0;j<c2;j++)
            {
            System.out.print("Enter mat2["+i+"]["+j+"] : ");
            mat2[i][j] = sc.nextInt();
           }
           }
           for(int i=0;i<r1;i++)
           {
            for(int j=0;j<c2;j++)
            { 
                 mat3[i][j] = 0;
                for(int k=0;k<c1;k++)
                {
                    mat3[i][j] = mat3[i][j] + (mat1[i][k]*mat2[k][j]);
                }
            }
           }
           System.out.println("The Multiplication of matrices is : ");
           for(int i=0;i<r1;i++)
           {
            for(int j=0;j<c2;j++)
            {
                System.out.print(" "+mat3[i][j]);
            }
            System.out.println("");
           }
           }
           else
            System.out.println("Matrices multiplication is not possible ");
        }
    }
