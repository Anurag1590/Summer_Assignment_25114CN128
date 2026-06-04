//Code to print fibonacci series
import java.util.*;
public class Question_13 {
    public static void main (String[] args)
    {
        int n;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the term upto which fibonacci series will be printed : ");
        n = Sc.nextInt();
        int t1=0;
        int t2=1;
        System.out.print(+t1+" "+t2);
        int nextterm= 0;
        for(int i=2;i<n;i++)
        {
          nextterm = t1+t2;
         System.out.print(" "+nextterm); 
          t1=t2;
          t2=nextterm;
        }
    }
}
