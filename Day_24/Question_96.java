// Code to remove duplicate characters.
import java.util.*;
public class Question_96 {
    public static void main(String[] args)
    {
        String s1;
        String s2 ="";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        s1 = sc.nextLine();
         for(int i=0;i<s1.length();i++)
        {
            int count =0;
            char ch = s1.charAt(i);
            for(int j=0;j<i;j++)
            {
                char ch1 = s1.charAt(j);
                if(ch==ch1)
                {
                count++;
                break;
                }
            }
            if(count==0)
            {
                s2 = s2+ch;
            }
        }
        System.out.println("The new string is : "+s2);
    }
}
