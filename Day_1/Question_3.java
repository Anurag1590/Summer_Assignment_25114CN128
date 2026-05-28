import java.util.*;
public class Question_3 {
public static void main(String[] args)
{
    int n ;
    Scanner Sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
    n = Sc.nextInt();
    int fact =1;
    for(int i=n;i>=1;i--)
    {
        fact = fact*i;
    }
    System.out.println("Factorial of "+n+" is "+fact);
}    
}
