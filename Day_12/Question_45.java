// Code to Write function for palindrome. 
import java.util.Scanner;
public class Question_45 {
    public static void main(String[] args) 
    {
            int n;
            Scanner Sc = new Scanner(System.in);
            System.out.print("Enter the number : ");
            n = Sc.nextInt();
           boolean palin = palindrome(n);
           if(palin == true)
           System.out.println(+n+" is a palindrome number");
           else
           System.out.println(+n+" is not a palindrome number");
        }
        public static boolean palindrome(int x)
        {
            int x1=x;
            int rev =0;
            while(x>0)
            {
            int r =  x%10;
            rev = rev*10+r;
            x = x/10;
            }
            if(rev ==x1)
                return true;
            else
                return false;
        }
    }

