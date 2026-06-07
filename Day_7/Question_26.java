//Code to print recursive fibonacci series.
import java.util.*;
public class Question_26 {
        public static void main(String[] args)
    {
        int n ;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = Sc .nextInt();
        for(int i=0;i<n;i++)
        {
        int result = fib(i);
        System.out.print( " "+result );
        }
    }
    public static int fib(int x)
    {
        if(x==0)
            return 0;
        else if(x==1)
            return 1;
        else
        {
            return (fib(x-1) + fib(x-2));
        }
    }
}
