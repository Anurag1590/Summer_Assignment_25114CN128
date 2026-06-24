// Code to find longest word.
import java.util.*;
public class Question_95 {
     public static void main(String[] args)
    {
        String s1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        s1 = sc.nextLine();
        int l = s1.length();
        String word = "";
        String longestWord = "";
        for(int i=0;i<s1.length();i++)
        {
            char ch = s1.charAt(i);
            if(ch!= ' ')
            {
                word =word+ch;  
            } 
            else 
                {
                if(word.length()>longestWord.length()) 
                {
                    longestWord=word;
                }
                word = "";   
                }
         }
            if (word.length()>longestWord.length()) 
            {
            longestWord =word;
            }
        System.out.println("Longest word: " + longestWord);
        System.out.println("Length: " + longestWord.length());
    }
}
