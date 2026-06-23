// Code to find first repeating character.
import java.util.*;
public class Question_90 {
    public static void main(String[] args) 
    {
        String s ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  the string : ");
        s = sc.nextLine();
        int l = s.length();
        int count =0;
        for(int i=0;i<l;i++)
        {
            char ch = s.charAt(i);
            for(int j=i+1;j<l;j++)
            {
                char ch1 = s.charAt(j);
                if(ch==ch1)
                {
                    System.out.println("The first repeating character is : "+ch);
                    count++;
                    break;
                }
            }
           if(count>0)
            break;
        }
        if(count==0)
        {
            System.out.println("No repeating character found");
        }
    }
}

