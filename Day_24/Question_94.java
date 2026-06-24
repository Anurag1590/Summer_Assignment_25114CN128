// Code to compress a string.
import java.util.*;
public class Question_94 {
     public static void main(String[] args)
    {
        String s1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        s1 = sc.nextLine();
        String s2 = "";
        for(int i=0;i<s1.length();i++)
        {
            Integer count =1;
            while((i<s1.length()-1)&&(s1.charAt(i)==s1.charAt(i+1)))
            {
                count++;
                i++;
            }
            s2 = s2+s1.charAt(i);
            if(count>1)
            {
                s2 = s2 + count.toString();
            }
        }
        System.out.println("The compressed string is : "+s2);
}
}
