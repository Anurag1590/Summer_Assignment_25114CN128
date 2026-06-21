// Code to find string length.
import java.util.*;
public class Question_81 {
    public static void main(String[] args) 
    {
        String s ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  the string : ");
        s = sc.nextLine();
        int count =0;
        int i=0;
       char ch = ' '; 
       while(true)
       {
        try
        {
        ch = s.charAt(i);
        count++;
        i++;
       }
       catch (StringIndexOutOfBoundsException e)
            {
                break; 
            }
      }

 System.out.println("Length of the string is "+count);
    }
}
