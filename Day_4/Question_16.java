//Code to print all Armstrong numbers in a given range.
import java.util.Scanner;

public class Question_16 {
    public static void main(String[] args)
    {
        int n1 ;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the starting term of the range : ");
        n1= Sc.nextInt();
        int n2 ;
        System.out.print("Enter the ending term of the range : ");
        n2= Sc.nextInt();
        for(int i =n1;i<=n2;i++)
        {
        int n=i;
        int count =0;
        double arm =0;
        while(n>0)
        {
          count++;
           n =n/10;
        }
          n =i ;
        while(n>0)
        {
           int r =n%10;
           arm = arm + Math.pow(r,count);
           n = n/10;
        }
        if(i==arm)
        {
            System.out.print( " "+i);
        }
    } 
    }
}
