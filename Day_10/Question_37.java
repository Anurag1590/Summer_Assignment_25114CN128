// Code to print star pyramid pattern
import java.util.*;
class Question_37 {
    public static void main(String[] args) {
        int n ;
        System.out.print("Enter n : ");
        Scanner Sc= new Scanner(System.in);
        n = Sc.nextInt();
        for(int i =1;i<=n;i++)
        {
            for(int k=n;k>=i;k--)
            {
                 System.out.print(" ");
            }
            for(int j =1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
                System.out.println();
        }
    }
}