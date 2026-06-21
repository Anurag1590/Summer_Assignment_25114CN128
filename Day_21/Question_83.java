// Code to count vowel and consonant in a string.
import java.util.*;
public class Question_83 {
     public static void main(String[] args) 
    {
        String s ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  the string : ");
        s = sc.nextLine();
        int l = s.length();
        int count_vowel =0;
        int count_consonant =0;
        for(int i=0;i<l;i++)
        {
            char ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                count_vowel++;
            }
            else if(ch!=' ')
            {
            count_consonant++;
            }
        }
            System.out.println("Number of vowels is : "+count_vowel);
            System.out.println("Number of consonant is : "+count_consonant);
    }
}
