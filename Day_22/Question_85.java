// Code to check whether a string is palindrome or not.
import java.util.*;
public class Question_85 {
    public static void main(String[] args) 
    {
        String s ;
        String s1 = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  the string : ");
        s = sc.nextLine();
        int l = s.length();
        for(int i=l-1;i>=0;i--)
        {
            char ch = s.charAt(i);
            s1 = s1+ ch;
        }
        if(s.equals(s1))
        {
            System.out.println("The string is Palindrome ");
        }
        else
        {
            System.out.println("The string is not Palindrome ");
        }
    }
}
