// Code to remove spaces from string.
import java.util.*;
public class Question_88 {
    public static void main(String[] args) 
    {
        String s ;
        String s1 = "";
        int count =0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  the string : ");
        s = sc.nextLine();
        int l = s.length();
        for(int i=0;i<l;i++)
        {
          char ch = s.charAt(i);
          if(ch!=' ')
          {
            s1 = s1+ch;
          }
        }
        System.out.println("The new string is : "+s1);
    }
}
