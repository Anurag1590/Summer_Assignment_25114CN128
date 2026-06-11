// JAVA code to print sum of numbers uptp a given number
import java.util.*;
public class Question_1 {
    public static  void main(String[] args)
    {
    int n ;
    int sum =0;
    Scanner Sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
    n = Sc.nextInt();
    for(int i=0;i<=n;i++)
    {
        sum = sum +i;
    }
    System.out.println("Sum of numbers upto "+n+" is "+sum);
}
}
