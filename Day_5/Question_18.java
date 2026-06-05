//Code to check whether the number is Strong number or not.
import java.util.*;

public class Question_18 {
    public static void main(String[] args)
    {
        int n ;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = Sc.nextInt();
        int sum =0;
        int n1=n;
        while(n>0)
        {
         int r = n%10;
         int fact =1;
         for(int i=r;i>=1;i--)
         {
            fact = fact*i;
         }
         sum = sum + fact;
         n =n/10;
        }
       if(sum ==n1)
       {
        System.out.println(+n1+" is a Strong number");
       }
       else
        {
        System.out.println(+n1+" is not a Strong number");
       }
    }
}
