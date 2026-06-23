// Code to find first non repeating character.
import java.util.*;
public class Question_89 {
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
            count =0;
            char ch = s.charAt(i);
            for(int j=0;j<l;j++)
            {
                char ch1 = s.charAt(j);
                if((i!=j)&&(ch==ch1))
                {
                 count++;
                }
            }
                if(count==0)
                {
                    System.out.println("The first non repeating character is : "+ch);
                    break;
                }
        }
        if(count>0)
        {
            System.out.println("No non repeating character found");
        }
}
}
