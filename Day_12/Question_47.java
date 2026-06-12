// Code to write fuction for fibonacci series.
import java.util.*;
public class Question_47 {
     public static void main(String[] args)
      {
            int n ;
            Scanner Sc = new Scanner(System.in);
            System.out.print("Enter the number : ");
            n = Sc.nextInt();
            int fibo =fibonacci(n);
            System.out.print(+n+"th Fibonacci term is "+fibo); 
       }
 public static int fibonacci(int x)
 { 
        if (x == 0)
            return 0;
        if (x == 1)
            return 1;

        int t1 = 0;
        int t2 = 1;
        int nextterm = 0;

        for (int i=2; i<=x;i++) 
            {
            nextterm = t1+t2;
            t1=t2;
            t2=nextterm;
        }

        return nextterm;
    }
}
