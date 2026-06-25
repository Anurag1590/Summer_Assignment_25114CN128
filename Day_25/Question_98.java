// Code to print all commom characters from an string.
import java.util.*;
public class Question_98 {
     public static void main(String[] args) 
        {
         String s1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        s1 = sc.nextLine();
        for(int i =0;i<s1.length();i++)
        {
                char ch1 = s1.charAt(i);
             boolean alreadyPrinted = false;
            for (int k =0;k<i;k++) {
                if (s1.charAt(k) ==ch1) 
                    {
                    alreadyPrinted=true;
                    break;
                }
            }
            if (alreadyPrinted) {
                continue;
            }
             int count =0;
           for(int j=0;j<s1.length();j++)
            {
                char ch2 = s1.charAt(j);
                if(ch1==ch2&&i!=j)
                {
                    count++;
                }
            } 
             if(count>0)
        {
            System.out.print(" "+ch1);
        }
        }
       
}
}
