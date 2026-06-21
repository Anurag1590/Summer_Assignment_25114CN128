// Code to reverse a string.
import java.util.*;
public class Question_82 {
    public static void main(String[] args) 
    {
        String s ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  the string : ");
        s = sc.nextLine();
        int l = s.length();
        System.out.print("The reversed string is : ");
        for(int i=0;i<l;i++)
        {
            char ch = s.charAt(i);
            System.out.print(ch);
        }
}
}
