// Code to find maximum of two numbers using function.
import java.util.*;
public class Question_42 {
    public static void main(String[] args)
    {
        int n1;
        int n2;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        n1 = Sc.nextInt();
        System.out.println();
        System.out.print("Enter second number : ");
        n2 = Sc.nextInt();
        int maximum = max(n1,n2);
        if(maximum==0)
        {
          System.out.println("Both numbers "+n1+" & "+n2+" are equal");
        }
        else
        {     
        System.out.println(+maximum+" is the greatest among "+n1+" & "+n2);
        }
}
public static int max(int x1,int x2)
{
  if(x1>x2)
    return x1;
else if(x2>x1)
    return x2;
else 
    return 0;
}
}
