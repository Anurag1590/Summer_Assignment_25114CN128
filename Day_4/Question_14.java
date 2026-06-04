//Code to print Nth term of a Fibonacci series.
import java.util.*;

public class Question_14 {
    public static void main (String[] args)
    {
        int n;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the Nth term : ");
        n = Sc.nextInt();
        int t1=0;
        int t2=1;
        int nextterm= 0;
        for(int i=2;i<n;i++)
        {
          nextterm = t1+t2;
          t1=t2;
          t2=nextterm;
        }
        System.out.print(" "+nextterm); 
    }
}
