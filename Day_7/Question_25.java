//Code to find recursive factorial of a number.
import java.util.*;
public class Question_25 {

    public static void main(String[] args)
    {
        int n ;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = Sc .nextInt();
        int result = fact(n);
        System.out.println("Factorial of "+n+" is "+result);
    }

 public static int fact(int x )
 {
    int fac =1;
    if(x==0||x==1)
        fac =1;
    else
    {
    fac = x * fact(x-1);
    }
    return fac;
 }
}