// Code to convert lowercase to uppercase.
import java.util.*;
public class Question_84 {
     public static void main(String[] args) 
    {
        String s ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  the string : ");
        s = sc.nextLine();
        int l = s.length();
        for(int i=0;i<l;i++)
        {
            char ch = s.charAt(i);
            if(ch>='a'&&ch<='z')
            {
                ch = (char)(ch - 32);
                System.out.print(ch);
            }
            else
                {
                    System.out.print(ch);
                }
        }
    }
}
