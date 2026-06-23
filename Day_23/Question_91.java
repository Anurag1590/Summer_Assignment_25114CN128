// Code to check anagram strings.
import java.util.*;
public class Question_91 {
    public static void main(String[] args) 
    {
        String s ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string : ");
        s = sc.nextLine();
        String s1;
        System.out.print("Enter second string : ");
        s1 = sc.nextLine();
        char[] a = s.toCharArray();
        char[] b = s1.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a, b)) 
        {
            System.out.println("Anagram Strings");
        }
         else
        {
            System.out.println("Not Anagram Strings");
        }
    }
}