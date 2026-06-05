//Code to print Largest Prime Factor of a number.
import java.util.*;

public class Question_20 {
    public static void main(String[] args)
    {
        int n ;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = Sc.nextInt();
        int max = Integer.MIN_VALUE;
        for(int i =1;i<=n;i++)
        {
            if(n%i==0)
            {
                int c =0;
             for(int j =1;j<=i;j++)
                {
                    if(i%j==0)
                    {
                        c++;
                    }
                }
                    if(c==2)
                    {
                     if(i>max)
                     {
                        max =i;
                     }
                    }            
            }
        }
        System.out.println("The largest prime factor of "+n+" is "+max);
}
}
