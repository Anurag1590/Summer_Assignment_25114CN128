// Code to write function for perfect number.
import java.util.*;
public class Question_48 {
     public static void main(String[] args) 
    {
           int n;
           Scanner Sc = new Scanner(System.in);
           System.out.print("Enter the number : ");
           n = Sc.nextInt();
           boolean result = perfect(n);
           if(result == true)
           System.out.println(+n+" is a perfect number");
           else
           System.out.println(+n+" is not a perfect number");
        }
     public static boolean perfect(int x)
     {
        int sum =0;
        for(int i =1;i<=x/2;i++)
        {
            if (x%i==0)
            {
                sum = sum + i;
            }
        }
       if(sum ==x)
       {
        return true;
       }
       else
        {
        return false;
       }
     }
}
