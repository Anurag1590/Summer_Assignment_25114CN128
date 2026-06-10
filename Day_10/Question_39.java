// Code to Print number pyramid.
import java.util.Scanner;
public class Question_39 {
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
            for(int j =1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(int m = i-1;m>=1;m--)
            {
                System.out.print(m);
            }
                System.out.println();
        }
}
}
