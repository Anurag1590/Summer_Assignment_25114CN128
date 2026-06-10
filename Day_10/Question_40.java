// Code to print character pyramid
import java.util.*;
public class Question_40 {
    public static void main(String[] args) {
        int n ;
        System.out.print("Enter n : ");
        Scanner Sc= new Scanner(System.in);
        n = Sc.nextInt();
        for(int i =1;i<=n;i++)
        {
            char ch = 'A';
            for(int k=n;k>=i;k--)
            {
                 System.out.print(" ");
            }
            for(int j =1;j<=i;j++)
            {
                System.out.print(ch);
                ch++;
            }
            ch -=2;
            for(int m = i-1;m>=1;m--)
            {
                System.out.print(ch);
                ch--;
            }
                System.out.println();
        }
}
}
