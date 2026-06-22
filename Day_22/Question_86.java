// Code to count number of words.
import java.util.*;
public class Question_86 {
   public static void main(String[] args) 
    {
        String s ;
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
            count++;
          }
        }
       System.out.println("Number of words is : "+count);
    }
}
