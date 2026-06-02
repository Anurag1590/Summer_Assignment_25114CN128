//Code to check whether a given number is palindrome or not
import java.util.*;
public class Question_8 {
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
        if(rev == n1)
            System.out.println(+n1+" is a palindrome number");
        else
            System.out.println(+n1+" is not a palindrome number");
}
}