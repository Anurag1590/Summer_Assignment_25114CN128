// Code  to Write function to find factorial.
import java.util.*;
public class Question_44 {
    public static void main(String[] args)
    {
        int n1;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n1 = Sc.nextInt();
        int factorial = fact(n1);
        System.out.println("Factorial of "+n1+" is "+factorial);
    }
public static int fact(int x1)
{
  int factorial=1;
  for(int i =x1;i>=1;i--)
  {
    factorial = factorial *i;
  }
return factorial;
}
}
