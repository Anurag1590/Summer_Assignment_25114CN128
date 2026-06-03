//code to check whether a given number is prime or not.
import java.util.*;
 public class Question_9
 {
    public static void main(String[] args)
    {
        int n ;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = Sc.nextInt();
        int c =0;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                c++;
                break;
            }
        }
        if(c==0)
        {
            System.out.println(+n+" is a prime number");
        }
        else
        {
            System.out.println(+n+" is not a prime number");
        }
    } 
 }