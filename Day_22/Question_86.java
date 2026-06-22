// Code to count number of words.
import java.util.*;
public class Question_86 {
   public static void main(String[] args) 
    {
        String s ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  the string : ");
        s = sc.nextLine();
        int l = s.length();
        if(s.trim().isEmpty()) 
          {
          System.out.println("Number of words is zero");
          }
          else
          {
          String[] words = s.trim().split("\\s+");
          int len = words.length;
          System.out.println("Number of words is: " + len);
         }
    }
}
