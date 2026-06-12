// Code to write function for armstrong number.
import java.util.*;
public class Question_46 {
           public static void main(String[] args)
            {
            int n;
            Scanner Sc = new Scanner(System.in);
            System.out.print("Enter the number : ");
            n = Sc.nextInt();
           boolean arm = armstrong(n);
           if(arm == true)
           System.out.println(+n+" is a armstrong number");
           else
           System.out.println(+n+" is not a armstrong number");
        }
        public static boolean armstrong(int x)
        {
        int x1=x;
        int count =0;
        double arm =0;
        while(x>0)
        {
          count++;
          x =x/10;
        }
        x = x1;
        while(x>0)
        {
           int r =x%10;
           arm = arm + Math.pow(r,count);
           x = x/10;
        }
        if(arm==x1)
        {
            return true;
        }
        else
        {
            return false;
        }
}
}
