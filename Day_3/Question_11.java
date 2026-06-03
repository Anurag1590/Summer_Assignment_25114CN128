//Code to find Greatest Common Divisor of two numbers
import java.util.*;
public class Question_11 {
    public static  void main(String[] args)
    {
        int n1;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        n1 = Sc.nextInt();
        System.out.println("");
        int n2;
        System.out.print("Enter second number : ");
        n2 = Sc.nextInt();
        int gcd = Integer.MIN_VALUE;
        int l = Math.max(n1, n2);
        for(int i=1;i<l;i++)
        {
            if((n1%i==0)&&(n2%i==0))
            {
                if(i>gcd)
                    gcd=i;
            }
        }
        System.out.println("GCD of "+n1+" & "+n2+" is "+gcd);
    }
}
