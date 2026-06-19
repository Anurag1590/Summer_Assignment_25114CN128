// Code to find sum of diagonal elements.
import java.util.*;
public class Question_76
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
           if(r1==c1)
           {
           int[][] mat1 = new int[r1][c1];
           int sum =0;
           for(int i =0;i<r1;i++)
            {
            for(int j =0;j<c1;j++)
            {
            System.out.print("Enter mat1["+i+"]["+j+"] : ");
            mat1[i][j] = sc.nextInt();
           if(i==j||i+j==r1-1)
           {
            sum += mat1[i][j];
           }
        }
    }
    System.out.println("The sum of diagonal elements are : "+sum);
}
        }
 }
