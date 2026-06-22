// Code to find character frequency.
import java.util.*;
public class Question_87 {
    public static void main(String[] args) 
    {
        String s ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  the string : ");
        s = sc.nextLine();
        int l = s.length();
        for(int i=0;i<l;i++)
        { 
          char ch = s.charAt(i);
          boolean alreadyCounted = false;
            for(int k =0; k<i;k++) {
                if (s.charAt(k)==ch) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (alreadyCounted || ch == ' ')
                {
                    continue;
                }
            int count =1;
          for(int j =i+1;j<l;j++)
          {
            char ch1 = s.charAt(j);
            if(ch==ch1)
                count++;
          }
          if(count>0)
          {
            System.out.println("Frequency of "+ch+" is : "+count);
          }
          }
        }
}

