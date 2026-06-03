 //Code to print the prime numbers in a given range
 import java.util.*;
public class Question_10 {
    public static void main(String[] args)
    {
        int n1 ;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the starting limit of the range : ");
        n1 = Sc.nextInt();
        int n ;
        System.out.print("Enter the ending limit of the range : ");
        n = Sc.nextInt();
        System.out.println("The prime numbers in the range "+n1+" to "+n+" is : ");
        for(int i=n1;i<=n;i++)
        {
            int c =0;
        for(int j=2;j<=i/2;j++)
        {
            if(i%j==0)
            {
               c++;
            }
        }

        if(c==0)
        {
             System.out.println(+i);
        }
    } 
 }
}
