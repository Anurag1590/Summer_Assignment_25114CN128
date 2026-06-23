// Code to find maximum occuring character.
import java.util.*;
public class Question_92 {
    public static void main(String[] args) 
    {
        String s ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  the string : ");
        s = sc.nextLine();
        int l = s.length();
        int maxCount = 0;
        char maxChar = ' ';

        for (int i=0;i<l;i++)
         {
            int count = 0;
            char ch = s.charAt(i);

            for (int j = 0; j < l; j++) 
            {
                if (ch==s.charAt(j))
                 {
                    count++;
                }
            }

            if (count>maxCount) 
            {
                maxCount = count;
                maxChar = ch;
            }
        }

        System.out.println("Maximum occurring character is: " + maxChar);
        System.out.println("Frequency: " + maxCount);
    }
}

