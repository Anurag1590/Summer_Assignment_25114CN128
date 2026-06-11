//Code to find number of digits in a number
import java.util.*;
public class Question_4 {
    public static void main(String[] args )
    {
       int n ;
       Scanner Sc = new Scanner(System.in);
      System.out.print("Enter the number : ");
      n = Sc.nextInt();
      int n1=n;
      int c =0;
      while(n>0)
      {
        c++;
        n =n/10;
      }
      System.out.println("Number of Digits in "+ n1 +" is "+c);
    }
}
