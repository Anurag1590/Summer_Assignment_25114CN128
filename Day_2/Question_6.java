// Code to find reverse of a given number
import java.util.*;
public class Question_6 {
    public static void main(String[] args )
    {
        int n ;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = Sc.nextInt();
        int n1=n;
        int r = 0;
        int rev = 0 ;
        while(n>0)
        {
            r =n%10;
            rev = rev*10+r;
            n =n/10;
        }
        System.out.println("Reverse of "+n1+" is "+rev);

    }
}
